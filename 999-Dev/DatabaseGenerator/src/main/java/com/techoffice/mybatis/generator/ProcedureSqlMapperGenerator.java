package com.techoffice.mybatis.generator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techoffice.freemarker.util.FreemakerUtil;
import com.techoffice.mybatis.generator.util.ProcedureUtil;
import com.techoffice.util.StringUtil;

public class ProcedureSqlMapperGenerator {
	
	public static String generate(String packageName, String procedureName){
		Map<String, Object> dataModel = new HashMap<String, Object>();
		String methodName = procedureName.replace("PL_", "");
		methodName= StringUtil.upperUnderscoreToLowercamel(methodName);
		dataModel.put("methodName", methodName);
		dataModel.put("pakcageName", packageName);
		dataModel.put("procedureName", procedureName);
		List<Map<String, String>> argumentList = ProcedureUtil.getArgumentList(packageName, procedureName);
		dataModel.put("argumentList", argumentList);
		return FreemakerUtil.generate(ProcedureSqlMapperGenerator.class, dataModel);
	}
	
	public static void main(String[] args){
		String content = generate("PA_J_BM_SETL_ACTN_XREF_DETL", "PL_REV_VCHR_AND_SETL_HIST");
		System.out.println(content);
	}
}