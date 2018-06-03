package com.ss.Dao;


import com.ss.pojo.Student;

public interface StudentDao extends GeneralDao<Student>{

	int onWorkSize() ;

	int countByVocation(int i);

}
