package com.ss.controller;


import com.ss.Dao.VocationDao;
import com.ss.pojo.Student;
import com.ss.pojo.Vocation;
import com.ss.service.StudentService;
import com.ss.service.VocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller

public class T4Controller {

    Logger logger = LoggerFactory.getLogger(T4Controller.class);

    @Resource
    StudentService stuService; //这个名字要和刚才注入式给的一样

    @Autowired
    VocationService vocationService;


    @RequestMapping(value = "/u/thehome", method = RequestMethod.GET)
    public Object getHome(Model model, HttpServletRequest request)throws Exception{

        List<Student> list = new ArrayList<Student>();
        int workSize = stuService.onWorkSize();
        int count = stuService.getSize();

        for (int i = 0; i < 4; i++) {
            // 数据库目前总共有2600左右的数据，优秀学员展示前百分之一。(因为现在数据库自增id是连续的，后续有删除操作不连续会有影响)
            int randomStu = (int) ( ( Math.random() * (count/100) ) + 1 );
            Student student = stuService.findById(randomStu);
            list.add(student);
        }

        model.addAttribute("listBean",list);
        model.addAttribute("workSize",workSize);
        model.addAttribute("allCount",count);

        if("true".equals(request.getParameter("toJson"))){
            return "jsonThehome";
        }
        return "home";

    }

    @RequestMapping(value = "/allvocation", method = RequestMethod.GET)
    public String getVocation( Model model, HttpServletRequest request)throws Exception{

        List<Vocation> list = new ArrayList<Vocation>();

        for (int i = 1; i < 7; i++) {
            Vocation vocation = vocationService.findById(i);
            int sum = stuService.countByVocation(i);
            if(null!=vocation)
            vocation.setNumber(sum);
            //logger.info(vocation+"");
            list.add(vocation);
        }

        model.addAttribute("vocationList",list);

        if("true".equals(request.getParameter("toJson"))){
            return "jsonAllvocation";
        }

        return "home.vocation";

    }

    @RequestMapping(value = "/co-company", method = RequestMethod.GET)
    public String getCompany( Model model)throws Exception{

        return "home.company";

    }

    // 这个是任务二 人员列表的入口
    @RequestMapping(value = "/taskUser", method = RequestMethod.GET)
    public String welcome( Model model)throws Exception{

        return "welcome";
    }


}
