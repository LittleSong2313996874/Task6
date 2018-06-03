package com.ss.service;

import com.ss.pojo.Vocation;

public interface VocationService {
    //注意这里只有一个参数，则#{}中的标识符可以任意取
    Vocation findById(int l);
}
