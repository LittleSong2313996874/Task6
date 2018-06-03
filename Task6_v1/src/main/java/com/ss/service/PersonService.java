package com.ss.service;

import com.ss.pojo.PageBean;
import com.ss.pojo.Person;

import java.util.List;

public interface PersonService {

    int addPerson(Person person);

    int updatePerson(Person user);

    int deletePerson(int id);

    List<Person> getAll();

    Person getPersonById(int id);

    int seleteCount();

    PageBean<Person> displayByPage(int currentPage);
}
