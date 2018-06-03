package com.ss.controller;


import com.ss.pojo.User;
import com.ss.service.UserService;
import com.ss.util.DES.Md5Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;

//管理登录注册
@Controller
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;


    @RequestMapping(value = "/u/login", method = RequestMethod.POST)
    public String Login(Model model, User user,HttpServletRequest request, HttpServletResponse response)throws Exception{
        /*
         *如果有人直接访问这个路径，即没有通过register.jsp提交表单数据这一环节，
         *那么user也不会为null,我之前本来还担心如果有用户直接访问会报空指针异常的
         * 现在看来，如果没有表单数据，SpringMvc还是会创建相应对象，
         * 只不过属性赋空值而已
         */

        logger.info("进入/u/login");

        //默认登录状态是false
        request.setAttribute("isSuccess",false);

        user.setPassword(Md5Util.string2MD5(user.getUsername()+user.getPassword()));
        logger.info("用户登录信息：[ "+user.getUsername()+": "+user.getPassword()+" ]");
        if(userService.isLogin(user) != null){
            logger.info("登录成功");
            //如果在数据库查到了信息，更登录状态为true
            request.setAttribute("isSuccess",true);

            if("true".equals(request.getParameter("toJson"))){
                return "redirect:/u/thehome?toJson=true";
            }
            return "redirect:/u/thehome";
        }

        model.addAttribute("msg","<br/><font color='red' size='3'>用户名或密码不正确 ! </font><br/>");
        return "login";

    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String Register(Model model, User user)throws Exception{
        logger.info("进入/Register");

        if(user.getUsername()!=null && (!user.getUsername().equals("")) && user.getPassword()!=null && ( ! "".equals(user.getPassword())) ){

            String str = user.getUsername()+user.getPassword();
            logger.info("用户账户密码： "+str);
            user.setPassword(Md5Util.string2MD5(str));

            if(userService.isLogin(user) != null){
                //如果在数据库查到了信息，代表已经注册过
                logger.info("账户已注册过，需更换");
                model.addAttribute("msg","<br/><font color='red' size='3'>该账户已存在，请更换用户名</font><br/>");
                return "register";
            }

            if (userService.registerUser(user) == 1){
                logger.info("用户注册信息：[ "+user.getUsername()+": "+user.getPassword()+" ]");
                model.addAttribute("msg","<br/><font color='green' size='3'>注册成功！</font><br/>");
                return "login";
            }
        }else {
            logger.info("注册的输入值为空或为空串");
            model.addAttribute("msg","<br/><font color='red' size='3'>  用户名和密码不能为空 ！</font><br/>");
            return "register";

        }

        model.addAttribute("message","<br/><font color='red' size='3'>我们碰到了些状况</font><br/>");
        return "failure";

    }



}

