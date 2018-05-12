package com.techoffice.h2.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.techoffice.database.convertor.AnnotatedFieldConvertor;
import com.techoffice.database.dao.EntityDao;
import com.techoffice.database.model.Entity;
import com.techoffice.database.model.Field;
import com.techoffice.database.model.Key;
import com.techoffice.database.registry.EntityDaoRegistry;
import com.techoffice.h2.model.Columns;
import com.techoffice.h2.model.Constraints;

public class H2EntityDao implements EntityDao{

	static {
		H2EntityDao h2EntityDao = new H2EntityDao();
		EntityDaoRegistry.add(H2EntityDao.class, h2EntityDao);
	}
	
	private H2EntityDao(){}
	
	@Override
	public List<Field> getFieldList(String tableName) {
		List<Columns> columnsList = ColumnsDao.getInstance().getColumnsList(tableName);
		return AnnotatedFieldConvertor.convert(columnsList);
	}

	@Override
	public Entity getEntity(String tableName) {
		Entity entity = new Entity();
		entity.setTableName(tableName);
		List<Field> fieldList = getFieldList(tableName);
		Key key = getKey(tableName);
		entity.setFieldList(fieldList);
		entity.setPrimaryKey(key);
		return entity;
	}

	@Override
	public Key getKey(String tableName) {
		Key key = new Key();
		Constraints keyConstraints = ConstraintsDao.getInstance().getPrimaryKeyConstraints(tableName);
		String collumnListStr = keyConstraints.getColumnList();
		List<String> collumnList = Arrays.asList(collumnListStr.split(","));
		List<Field> fieldList = getFieldList(tableName);
		List<Field> keyFieldList = new ArrayList<Field>();
		for (Field field: fieldList){
			if (collumnList.contains(field.getColumnName())){
				keyFieldList.add(field);
			}
		}
		key.setFieldList(keyFieldList);
		return key;
	}

}
