package com.ss.service;

import com.ss.pojo.PageBean;
import com.ss.pojo.Person;
import com.ss.pojo.Student;

import java.util.HashMap;
import java.util.List;

public interface StudentService {

    //注意这里只有一个参数，则#{}中的标识符可以任意取
    Student findById(int l);

    int getSize();

    int onWorkSize() ;


    int countByVocation(int i);

    PageBean<Student> displayByPage(int currentPage);

    int addStudent(Student student);


    int updateStudent(Student student) ;

    int deleteStudent(int id);



}
