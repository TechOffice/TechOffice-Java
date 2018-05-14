package com.techoffice.mybatis.generator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techoffice.database.util.StringUtil;
import com.techoffice.freemarker.util.FreemakerUtil;
import com.techoffice.mybatis.generator.base.SimpleEntityTemplateGenerator;
import com.techoffice.mybatis.generator.util.ProcedureUtil;

public class ProcedureSqlMapperGenerator extends SimpleEntityTemplateGenerator {
	
	public static String generate(String packageName, String procedureName){
		Map<String, Object> dataModel = new HashMap<String, Object>();
		String methodName = procedureName.replace("PL_", "");
		methodName= StringUtil.upperUnderscoreToLowerCamel(methodName);
		dataModel.put("methodName", methodName);
		dataModel.put("pakcageName", packageName);
		dataModel.put("procedureName", procedureName);
		List<Map<String, String>> argumentList = ProcedureUtil.getArgumentList(packageName, procedureName);
		dataModel.put("argumentList", argumentList);
		return FreemakerUtil.generate(ProcedureSqlMapperGenerator.class, dataModel);
	}
	
	public static void main(String[] args){
		String content = generate("XXX", "XXX");
		System.out.println(content);
	}
}
