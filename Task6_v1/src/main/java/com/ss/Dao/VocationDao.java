package com.ss.Dao;

import com.ss.pojo.Student;
import com.ss.pojo.Vocation;

import java.util.List;


public interface VocationDao {

	//int getSize();

	//注意这里只有一个参数，则#{}中的标识符可以任意取
	 Vocation findById(int l);

	//int onWorkSize() ;

	
}
