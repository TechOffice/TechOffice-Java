package com.techoffice.mybatis.util;

import java.util.ArrayList;
import java.util.List;

import com.techoffice.database.model.Entity;
import com.techoffice.database.model.Field;
import com.techoffice.database.model.Key;

public class MockUtil {

	public static List<Field> getDateFieldList(){
		List<Field> fieldList = new ArrayList<Field>();
		for (int i=0; i<5; i++){
			Field field = new Field();
			field.setColumnName("DATE_FIELD" + i);
			field.setJavaFullType("java.util.Date");
			field.setJdbcType("Number");
			field.setPropertyName("dateField" + i);
			fieldList.add(field);
		}
		return fieldList;
	}
	
	public static List<Field> getNumberFieldList(){
		List<Field> fieldList = new ArrayList<Field>();
		for (int i=0; i<5; i++){
			Field field = new Field();
			field.setColumnName("NUMBER_FIELD" + i);
			field.setJavaFullType("java.math.BigDeciaml");
			field.setJdbcType("Number");
			field.setPropertyName("numberField" + i);
			fieldList.add(field);
		}
		return fieldList;
	}
	
	public static List<Field> getStringFieldList(){
		List<Field> fieldList = new ArrayList<Field>();
		for (int i=0; i<5; i++){
			Field field = new Field();
			field.setColumnName("FIELD" + i);
			field.setJavaFullType("java.lang.String");
			field.setJdbcType("VARCHAR2");
			field.setPropertyName("field" + i);
			fieldList.add(field);
		}
		return fieldList;
	}
	
	public static Key getPrimaryKey(){
		Key key = new Key();
		List<Field> fieldList = getStringFieldList();
		fieldList.remove(3);
		fieldList.remove(3);
		key.setFieldList(fieldList);
		return key;
	}
	
	public static Entity getMockEntity(){
		Entity entity = new Entity();
		entity.setJavaClassName("Test");
		entity.setTableName("TEST");
		List<Field> fieldList = new ArrayList<Field>();
		fieldList.addAll(getStringFieldList());
		fieldList.addAll(getNumberFieldList());
		fieldList.addAll(getDateFieldList());
		entity.setFieldList(fieldList);
		entity.setPrimaryKey(getPrimaryKey());
		return entity;
	}
	
}
