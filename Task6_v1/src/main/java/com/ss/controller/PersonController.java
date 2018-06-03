package com.ss.controller;


import com.ss.pojo.Group;
import com.ss.pojo.PageBean;
import com.ss.pojo.Person;
import com.ss.pojo.Student;
import com.ss.service.PersonService;
import com.ss.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/taskUser")
public class PersonController {


    Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired  //Task2
    StudentService studentService; //这个名字要和刚才注入式给的一样

    //增加---------------------------------------------------------------------
    @RequestMapping(value = "/Person",method = RequestMethod.POST)
    public String insertPerson(Model model, Student person) throws Exception{

        logger.info("[添加操作] 人员信息："+person );
        int i = studentService.addStudent(person);
        if(i==1){
            //logger.info("Successful ! 新插入人员ID: ",person.getId());
            return "redirect:Persons";
        }
        model.addAttribute("message","没有插入成功 ！");
        return "failure";
    }

    //准备更新，先到达一个待修改页面 --------------------------------------------------
    @RequestMapping(value = "/prepare_update/{id}")
    public String prepareUpdate(Model model, @PathVariable("id") Integer id) throws Exception{
        logger.debug("[准备更新] 要修改的人员id为：  "+id+"");
        Student person1 = studentService.findById(id);
        if(person1!=null){
            logger.debug("先得到该人员信息： "+person1);
            model.addAttribute("person",person1);
            return "prepareUpdate";
        }else{
            model.addAttribute("message","根据这个ID没有查到数据");
            return "failure";
        }
    }

    //正式更新，向数据库发出请求
    @RequestMapping(value = "/Person", method = RequestMethod.PUT)
    public String updatePerson(Model model, Student person) throws Exception{
        logger.info("[执行更新] 用户刚刚输入的信息为："+person);
        if(person.getINTID()!=null){
            int i = studentService.updateStudent(person);
            if(i==1) {
                //logger.info("--更新成功--");
                return "redirect:Persons";
            }else{

                model.addAttribute("message","没有更新成功 ！");
                return "failure";
            }
        }else {
            //如果获得的id为空，说明用户不是从列表页面进来，而是直接访问
            return "redirect:myerror?illegal=1";
        }
        //return  "forward:getAll";
    }

    //查询所有
    @RequestMapping(value = "/Persons", method = RequestMethod.GET)
    public String getAllPerson(@RequestParam(value = "currentPage",defaultValue = "1", required = true) int currentPage, Model model){

        logger.info("[查询所有]  第"+currentPage+"页");
        PageBean<Student> pageBean= studentService.displayByPage(currentPage);
        model.addAttribute("pBean",pageBean);

        return "list";

    }

    @RequestMapping(value = "/Person", method = RequestMethod.GET)
    public String getPersonById( Model model, Integer id )throws Exception{
        logger.info("[通过ID查询]  收到id为："+id);

        if(id != null){
            Student personOne = studentService.findById(id);
            if(personOne!=null){
                //logger.info("通过id查找成功");
                model.addAttribute("user",personOne);
                return "getbyID";
            }else{
                //如果该id不存在与数据库中
                model.addAttribute("message","查无此人 ！");
                return "failure";
            }
        }else {
            model.addAttribute("message","您的输入为可能为空，或是非法操作");
            return "failure";
        }
    }


    //错误页面
    @RequestMapping(value = "/myerror")
    public String failure(Model model, Integer illegal) throws Exception{

        logger.error("[发生异常] 有操作发生了意外状况，请开发人员检测 ！");
        if (illegal==1) {
            model.addAttribute("message", "请从列表页面进行修改(非法操作)");
        }else if(illegal==5){
            model.addAttribute("message", "您删除的数据不存在(非法操作)");
        }

        return "failure";
    }

    //删除
    @RequestMapping(value = "/Person/{id}", method = RequestMethod.DELETE)
    public String Delete(@PathVariable("id") Integer id, Model model) throws Exception{
        logger.info("[删除操作]");
        int i = studentService.deleteStudent(id);
        if(i==1){
            logger.info("-- delete successful --");
        }else {
            /*
             *   注意下面的 ..代表返回上一级，
             *
             *   如果是  return "redirect:..myerror?illegal=5";
             * 重定向的路径为该路径(/myerror)替换当前末尾路径(/{id})加上前面的路径，
             * 为http://localhost:8080/taskUser/delete/myerror?illegal=5,这个路径显然是不存在的。
             *
             *   如果是 return "redirect:/myerror?illegal=5";
             * 由于第一个是 / , 重定向的路径为将是http://localhost:8080/myerror?illegal=5，这个也是不对的
             *
             *   只有当return "redirect:../myerror?illegal=5",
             *   先 .. 返回上一级(从 /{id} 返回到 /delete),在替换路径(/myerror替换/delete)
             *   猜得到了正确路径http://localhost:8080/taskUser/myerror?illegal=5
             *
             */
            return "redirect:../myerror?illegal=5";
            //return "redirect:/taskUser/myerror?illegal=5"; 正确,
        }
        /*
         *"redirect:/getAll"  会重定向到http://localhost:8080/getAll 这个地址显然是错的
         *"redirect:getAll"   这样会采取相对路径，重定向到http://localhost:8080/taskUser/getAll 这个才是正确的
         * 注意两者区别。
         * 如果没有redirect，直接return "xxx"; 会是转发，共享一个request。
         *  return  "forward:getAll"   转发，浏览器地址栏路径不会变
         *
         * 注意：下面redirect后路径以 / 开头，代表路径从contextpath开始算。
         * 这个项目中在tomcat容器运行会重定向到http://localhost:8080//taskUser/getAll,
         * 在jetty容器会重定向到http://localhost:8080/Jetty/taskUser/getAll,
         * 因为我jetty容器的contextpath为 /Jetty .
         */
        return "redirect:/taskUser/Persons";
    }

}
