package com.ss.test;

import com.danga.MemCached.MemCachedClient;
import com.danga.MemCached.SockIOPool;

public class Memcache {

    protected static Memcache mc = new Memcache();

    protected static MemCachedClient mcc = new MemCachedClient();

    static{
        //服务器列表和其权重
        String[] servers = {"39.105.68.241:11211"};
        //String[] servers = {"192.168.71.195:12000"};
        Integer[] weights = {3};

        //获取sock连接池的实例对象
        SockIOPool pool = SockIOPool.getInstance();

        //设置服务器信息
        pool.setServers(servers);
        pool.setWeights(weights);

        //设置初始连接数、最小最大连接数、最大处理时间
        pool.setInitConn(5);
        pool.setMinConn(5);
        pool.setMaxConn(250);
        pool.setMaxIdle(1000*60*60*6);

        //设置主线程的睡眠时间
        pool.setMaintSleep(30);

        //设置Tcp的参数，连接超时等
        pool.setNagle(false);
        pool.setSocketTO(30);
        pool.setSocketConnectTO(0);

        // 初始化连接池
        pool.initialize();

        //压缩设置，超过制定大小（单位K）的数据都会压缩
       /* mcc.setCompressEnable(true);
        mcc.setCompressThreshold(64*1024);  */
    }


    protected Memcache(){}

    public static Memcache getInstance(){
        return mc;
    }

    public static MemCachedClient getClient(){
        return mcc;
    }




    public static void main(String[] args) {
        try{
            // 本地连接 Memcached 服务
            MemCachedClient mcc = getClient();

            System.out.println("Connection to server sucessful.");
            Object OBJ = mcc.get("mark");
            System.out.println(OBJ);

            // 关闭连接


            //mcc.flushAll();

        }catch(Exception ex){
            System.out.println( ex.getMessage() );
        }
    }
}