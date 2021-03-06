package com.techoffice.oracle.servicegen.generator;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JPackage;
import com.sun.codemodel.JVar;
import com.techoffice.oracle.util.PojoUtil;
import com.techoffice.util.BeanUtil;


public class ServiceGenGenerator {

	private JCodeModel codeModel;
	private JDefinedClass jClass;
	private JFieldVar dao;
	
	public ServiceGenGenerator(String packageName, String tableName, JDefinedClass daoTyle, JDefinedClass  pojoType) throws JClassAlreadyExistsException {
		codeModel = new JCodeModel();
		JPackage jPackage = codeModel._package(packageName);
		jClass = jPackage._class(PojoUtil.getClassName(tableName) + "Serive");
		jClass.annotate(Service.class);
		codeModel.ref("");
		dao = jClass.field(JMod.PRIVATE, daoTyle, convertFirstCharToLowerCase(daoTyle.name()));
		dao.annotate(Autowired.class);
		
		addInsertMethod(pojoType);
		addUpdateMethod(pojoType);
		addDeleteMethod(pojoType);
		addSearchMethod(pojoType);
	}
	
	private void addInsertMethod(JDefinedClass pojoType){
		JMethod insert = jClass.method(JMod.PUBLIC, codeModel.VOID, "insert");
		insert.annotate(Transactional.class);
		insert.param(pojoType, pojoType.name());
		JBlock body = insert.body();
		codeModel.ref(pojoType.fullName());
		codeModel.ref("ac");
		JVar var1 = body.decl(codeModel.ref(Map.class).narrow(String.class, Object.class), "map", JExpr._new(codeModel.ref(HashMap.class).narrow(String.class, Object.class)));
		codeModel.ref(BeanUtil.class);
		body.directStatement("map.putAll(BeanUtil.getMap("+pojoType.name()+"))");
		body.directStatement(dao.name()+".insert(map);");
	}
	
	private void addUpdateMethod(JDefinedClass pojoType){
		JMethod update = jClass.method(JMod.PUBLIC, codeModel.VOID, "update");
		update.annotate(Transactional.class);
		JBlock body = update.body();
		update.param(pojoType, "test");
		JVar var1 = body.decl(codeModel.ref(Map.class).narrow(String.class, Object.class), "map");
		body.assign(var1, JExpr._new(codeModel.ref(HashMap.class)));
		body.directStatement(dao.name()+".insert(map);");
	}
	
	private void addDeleteMethod(JDefinedClass pojoType){
		JMethod delete = jClass.method(JMod.PUBLIC, codeModel.VOID, "delete");
		delete.annotate(Transactional.class);
		delete.param(pojoType, "test");
		JBlock body = delete.body();
		JVar var1 = body.decl(codeModel.ref(Map.class).narrow(String.class, Object.class), "map");
		body.assign(var1, JExpr._new(codeModel.ref(HashMap.class)));
		body.directStatement(dao.name()+".insert(map);");
	}
	
	private void addSearchMethod(JDefinedClass pojoType){
		JMethod search = jClass.method(JMod.PUBLIC, codeModel.ref(List.class).narrow(pojoType), "search");
		search.annotate(Transactional.class);
		JBlock body = search.body();
		search.param(pojoType, "test");
		JVar list = body.decl(codeModel.ref(List.class).narrow(pojoType), "list");
		JVar map = body.decl(codeModel.ref(Map.class).narrow(String.class, Object.class), "map");
		body.assign(map, JExpr._new(codeModel.ref(HashMap.class)));
		body.directStatement("dao.insert(map);");
		body.directStatement("list = (List<"+pojoType.name()+">) map.get(\"result\")");
		body._return(list);
	}


	public JDefinedClass generateCode(File file) throws IOException {
		codeModel.build(file);
		return jClass;
	}
	
	 private String convertFirstCharToLowerCase(String str){
		 String firstChar = str.substring(0, 1);
		 String convertedStr = firstChar.toLowerCase() + str.substring(1);
		 return convertedStr;
	 }
}
