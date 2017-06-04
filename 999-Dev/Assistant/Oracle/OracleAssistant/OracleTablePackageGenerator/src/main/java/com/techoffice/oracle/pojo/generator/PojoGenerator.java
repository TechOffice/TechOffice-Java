package com.techoffice.oracle.pojo.generator;

import java.io.File;
import java.io.IOException;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

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
import com.techoffice.oracle.model.Column;

public class PojoGenerator {

	 private JCodeModel codeModel;
	 private JDefinedClass jClass;
	 
	 public PojoGenerator(String packageName, String className) throws JClassAlreadyExistsException{
		 codeModel = new JCodeModel();
		 JPackage jPackage = codeModel._package(packageName);
		 jClass = jPackage._class(className);
	 }
	 
	 public void addField(Column column, Class<?> type, String name){
		 JFieldVar field = jClass.field(JMod.PRIVATE, type, name);
		 if (column.getPk() == 1){
			 field.annotate(Id.class);
		 }
		 if ("N".equals(column.getNullable())){
			 field.annotate(NotNull.class);
		 }
		 String getterMethodName = "get" + convertFirstCharToUpperCase(name);
		 JMethod getter = jClass.method(JMod.PUBLIC, type, getterMethodName);
		 JBlock getterBody = getter.body();
		 getterBody._return(field);
		 String setterMethodName = "set" + convertFirstCharToUpperCase(name);
		 JMethod setter = jClass.method(JMod.PUBLIC, type, setterMethodName);
		 JVar param = setter.param(type, name);
		 JBlock setterBody = setter.body();
		 setterBody.assign(JExpr._this().ref(field), param);
	 }
	 
	 public void generateCode(File file) throws IOException{
		 codeModel.build(file);
	 }

	 private String convertFirstCharToUpperCase(String str){
		 String firstChar = str.substring(0, 1);
		 String convertedStr = firstChar.toUpperCase() + str.substring(1);
		 return convertedStr;
	 }
}
