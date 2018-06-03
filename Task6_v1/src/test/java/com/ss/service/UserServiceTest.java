package com.ss.service;

import com.ss.cache.RedisCache;
import com.ss.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Autowired
    VocationService vocationService;

    @Test
    public void vocationTest() {

        System.out.println(RedisCache.getRandemTime()/60); // 495 500 490 510 505 515

    }


    @Test
    public void registerUser() {
        User user = new User();
        user.setUsername("小华");
        user.setPassword("1088762bd10ac5d1f135ce61263ada37");

        int i = userService.registerUser(user);

        System.out.println(i+"");
    }

    @Test
    public void isLogin() {

        User user = new User();
        user.setUsername("小华");
        user.setPassword("1088762bd10ac5d1f135ce61263ada37");

        String i = userService.isLogin(user);


        System.out.println(i+"");
    }
}