package com.ss.controller;


import com.ss.pojo.Group;
import com.ss.pojo.Person;
import com.ss.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/taskUser")
public class JsonController {


    Logger logger = LoggerFactory.getLogger(JsonController.class);

    @Resource
    PersonService personService; //这个名字要和刚才注入时给的一样。


    @RequestMapping(value = "/JsonPersons", method = RequestMethod.GET)
    public @ResponseBody Group getPureJsonAll(Model model) throws Exception{
        logger.info("[PURE JSON GET_ALL]");
        List list = personService.getAll();
        Group group = new Group();
        group.setGroupId(1);
        group.setGroupName("西安分院");
        group.setGroupMember(list);
        return group;
    }

    @RequestMapping(value = "/JsonPerson/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Person getPureJsonById(Model model, @PathVariable("id") Integer id) throws Exception{
        logger.info("[PURE JSON GET_ONE]");
        Person person = personService.getPersonById(id);
        return person;
    }


    //更新后把结果的json返回
    @RequestMapping(value = "/JsonPerson/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Person updatePureJsonById(Model model, @PathVariable("id") Integer id) throws Exception{
        logger.info("[PURE JSON UPDATE_ONE]");
        Person person = personService.getPersonById(id);

        person.setNAME("已更新");
        person.setGender("人妖");
        person.setAge(100);
        person.setSenior("宇智波佐助");

        return person;
    }



}
