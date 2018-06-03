package com.ss.service.Impl;

import com.ss.Dao.VocationDao;
import com.ss.cache.RedisCache;
import com.ss.controller.T4Controller;
import com.ss.pojo.Vocation;
import com.ss.service.VocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("vocationService")
public class VocationServiceImpl implements VocationService {

    Logger logger = LoggerFactory.getLogger(VocationServiceImpl.class);
    @Autowired
    RedisCache redisCache;

    @Resource
    VocationDao vocationDao;

    @Override
    public Vocation findById(int l) {

        String cache_key= RedisCache.CAHCENAME+"|findByIdVocation|"+l;
        Vocation vocation = redisCache.getCache(cache_key, Vocation.class);
        if(null == vocation){
            logger.info("缓存中没有，去数据库查找数据，key为："+cache_key);
            vocation =  vocationDao.findById(l);
            if(null!=vocation){
                redisCache.putCacheWithExpireTime(cache_key, vocation, RedisCache.getRandemTime());
                logger.info("put cache with key:  "+cache_key);
            }else {
                /**
                 * 如果数据库没有，为防止缓存穿透情况的发生，放null进去，失效时间设置4分钟。
                 * 另外如果我直接放null进去，序列化是会有空指针异常，但是也不能把它处理为空字符，因为类型不符
                 * 这里采取的办法是，new一个新对象，设置id为-1
                 */
                Vocation vocationNull = new Vocation();
                vocationNull.setNAME("Vocation_findByid_null");
                redisCache.putCacheWithExpireTime(cache_key, vocationNull, 60*4);
                logger.info("put cache with key:  "+cache_key);
            }

        }else{
            logger.info("get cache with key:  "+cache_key);
        }

        return vocation;
    }
}
