package com.techoffice.oracle.dao;

import java.util.List;

import com.techoffice.oracle.model.AllTabCol;
import com.techoffice.oracle.util.DaoUtil;

public class AllTabColDao {

	public List<AllTabCol> getTableColumnList(String tableName){
		return DaoUtil.list(AllTabCol.class, "SELECT * FROM ALL_TAB_COLS WHERE TABLE_NAME = '"+tableName+"'");
	}
		
}
