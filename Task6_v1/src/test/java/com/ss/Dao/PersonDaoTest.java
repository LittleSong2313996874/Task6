package com.ss.Dao;

import com.ss.pojo.Person;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class PersonDaoTest {

    @Autowired
    PersonDao personDao;
    Person person = new Person();

    Logger logger = Logger.getLogger(PersonDaoTest.class);
    @Test
    public void addPerson() {

        person.setNAME("测试9");
        person.setGender("女");

        int i= personDao.addObject(person);
       logger.info(i);
        logger.info("--------> "+ person.getId());
    }
    @Test
    public void updatePerson() {
        person = (Person) personDao.getObjectById(8);
        person.setNAME("王娇");
        person.setGender("女");
        int i = personDao.updateObject(person);//操作成功返回1
        logger.info(i);
    }

    @Test
    public void deletePerson() {
        int i = personDao.deleteObject(123);
        logger.info("--------> "+ i);//返回0，没有删除成功。返回1，删除成功。
    }

    @Test
    public void getAll() {
        List list = personDao.getAll();
        logger.info(list);
    }

    @Test
    public void getPersonById() {
        person = (Person)personDao.getObjectById(8);
        logger.info(person);
    }

    @Test
    public void testBASE() {
        int i = personDao.getSize();
        logger.info("人数： "+i);
    }

    @Test // lambda表达式
    public void lambda(){
        List<String> AreYouOk = Arrays.asList("nihao","wohao","dajiahao","caishi","zhendehao");
        AreYouOk.forEach(x -> logger.info(x));
        AreYouOk.forEach(logger::info);

    }

    @Test // lambda表达式
    public void Long(){
        long i = System.currentTimeMillis();
        List<String> AreYouOk = Arrays.asList("nihao","wohao","dajiahao","caishi","zhendehao");
        AreYouOk.forEach(x -> logger.info(x));
        AreYouOk.forEach(logger::info);
        i = System.currentTimeMillis()-i;
        System.out.println(i+"");
    }

}