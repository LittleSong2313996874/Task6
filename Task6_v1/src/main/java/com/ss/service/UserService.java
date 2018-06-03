package com.ss.service;

import com.ss.Dao.UserDao;
import com.ss.pojo.User;

public interface UserService {

    int registerUser(User user);

    String isLogin(User user);

}
