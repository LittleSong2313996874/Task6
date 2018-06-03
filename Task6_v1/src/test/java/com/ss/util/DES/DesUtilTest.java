package com.ss.util.DES;

import com.ss.cache.RedisCache;
import com.ss.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DesUtilTest {

    @Autowired
    RedisCache redisCache;

    @Test
    public void testMd5() {
        String s = "维多利亚123456";   // e5907f2617fb0d7c3edbfd3fa58534bd     维多利亚123456  db68e8d80ac3ac0862770e4a8d658ed8

        System.out.println(s);
        s = Md5Util.string2MD5(s);
        System.out.println(s);


    }

    @Test
    public void testMd52() {
        String s = "";   // e8dc4081b13434b45189a720b77b6818    维多利亚123456  db68e8d80ac3ac0862770e4a8d658ed8

        System.out.println(s);
        s = Md5Util.string2MD5(s);
        System.out.println(s);


    }






    @Test
    public void testString() throws Exception{

        final Base64.Decoder decoder = Base64.getDecoder();
        final Base64.Encoder encoder = Base64.getEncoder();
        final String text = "abc";
        final byte[] textByte = text.getBytes("UTF-8");
//编码
        final String encodedText = encoder.encodeToString(textByte);
        System.out.println(encodedText);
//解码
        System.out.println(new String(decoder.decode(encodedText), "UTF-8"));



    }


    @Test
    public void test0524() throws Exception{

        JedisPool pool = new JedisPool(new JedisPoolConfig(), "localhost");

        Jedis jedis = new Jedis("39.105.68.241",8084);
        jedis.auth("woshixiaokeai");
        //jedis.set("mark1", "Thank you,感谢你");
        String value = jedis.get("mark1");
        System.out.println(value);

    }

   /* @Test
    public void test3() throws Exception{


        Jedis jedis = new Jedis("0.0.0.0",0000);
        jedis.auth("123456");
        jedis.set("foo", "你i你好哈吼啊吼啊啊啊");
        String value = jedis.get("foo");
        System.out.println(value);

    }*/


    @Test
    public void test3() throws Exception{
        //System.out.println(redisTemplate.getClientList());
        Student student  = new Student();
        //student.setP_Name("玄小武");


        System.out.println(redisCache.getCache("mark7",student.getClass()));


    }

}