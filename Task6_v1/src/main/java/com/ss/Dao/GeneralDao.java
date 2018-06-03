package com.ss.Dao;

import com.ss.pojo.Person;

import java.util.HashMap;
import java.util.List;

public interface GeneralDao<T> {
    int addObject(T t);//boolean

    <T> int updateObject(T t);

    int deleteObject(int id);

    List<T> findByPage(HashMap<String, Object> map);

    List<T> getAll();

    T getObjectById(int id);

    int getSize();
}
