package com.ss.service.Impl;

import com.ss.Dao.PersonDao;
import com.ss.pojo.PageBean;
import com.ss.pojo.Person;
;
import com.ss.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service("personService")//将该对象加入容器，id为userService
public class PersonServiceImpl implements PersonService {

    @Resource
    PersonDao personDao;

    public PageBean<Person> displayByPage(int currentPage) {

        HashMap<String, Object> map = new HashMap<String, Object>();
        PageBean<Person> pageBean = new PageBean<Person>();

        //封装当前页数
        pageBean.setCurrPage(currentPage);

        //每页显示的数据默认为8

        //封装总记录数
        int totalCount = personDao.getSize();
        pageBean.setTotalCount(totalCount);

        //封装总页数
        int totalPage = 0;

        if (totalCount % pageBean.getPageSize() == 0)
            totalPage = totalCount / pageBean.getPageSize();
        else
            totalPage = totalCount / pageBean.getPageSize() + 1;

        pageBean.setTotalPage(totalPage);

        map.put("start", (currentPage - 1) * pageBean.getPageSize());
        map.put("size", pageBean.getPageSize());

        //封装每页显示的数据
        List<Person> lists = personDao.findByPage(map);
        pageBean.setLists(lists);

        return pageBean;
    }

    public int addPerson(Person person) {
        person.setCreate_at(System.currentTimeMillis());
        return personDao.addObject(person);
    }

    public int updatePerson(Person person) {
        person.setUpdate_at(System.currentTimeMillis());
        return personDao.updateObject(person);
    }

    public int deletePerson(int id) {
        return personDao.deleteObject(id);
    }

    public List<Person> getAll() {

        return personDao.getAll();
    }

    @Override
    public int seleteCount() {
        return personDao.getSize();
    }

    public Person getPersonById(int id) {

        return (Person) personDao.getObjectById(id);
    }
}
