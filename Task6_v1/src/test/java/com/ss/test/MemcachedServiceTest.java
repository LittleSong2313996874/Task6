package com.ss.test;

import com.danga.MemCached.MemCachedClient;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemcachedServiceTest
{

    private MemCachedClient memCachedClient;
    @Before
    public void beforeTest(){
        ApplicationContext atx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        memCachedClient = (MemCachedClient)atx.getBean("memCachedClient");
    }

    @Test
    public void memCached()
    {
       /* boolean b=memCachedClient.set("hello","dataValue");
        System.out.println(b);
        Object obj=memCachedClient.get("hello");
        System.out.println(obj);*/

       memCachedClient.stats().isEmpty();



    }

}
