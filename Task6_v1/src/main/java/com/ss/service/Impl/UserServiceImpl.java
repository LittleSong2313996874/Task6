package com.ss.service.Impl;

import com.ss.Dao.UserDao;
import com.ss.pojo.User;
import com.ss.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    UserDao userDao;

    @Override
    public int registerUser(User user) {
        user.setCreateAt(System.currentTimeMillis());
        return userDao.registerUser(user);
    }

    @Override
    public String isLogin(User user) {
        return userDao.isLogin(user);
    }

}
