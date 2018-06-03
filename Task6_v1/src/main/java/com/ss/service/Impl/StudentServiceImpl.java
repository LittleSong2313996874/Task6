package com.ss.service.Impl;

import com.ss.Dao.StudentDao;
import com.ss.cache.RedisCache;
import com.ss.pojo.PageBean;
import com.ss.pojo.Student;
import com.ss.service.StudentService;
import com.ss.util.others.PageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *  @Service 注解是标注在实现类上的，因为@Service是把spring容器中的bean进行实例化，
 * 也就是等同于new操作，只有实现类是可以进行new实例化的，而接口则不能，所以是加在实现类上的。
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

    /** @Resource 默认By name
     *
     * @Autowired   默认 By type, 可以加下面的注解来实现 By name.
     * @Qualifier("studentDao")
     */

    @Resource
    StudentDao studentDao;

    @Autowired
    RedisCache redisCache;

    /**
     * @param currentPage
     * @return
     */

    // 获得单页数据
    @Override
    public PageBean<Student> displayByPage(int currentPage) {
        if(currentPage<1){
            //异常抛出后下面的代码将不再继续执行。
            throw new RuntimeException("输入的页码有误，页码要不小于1。");
        }
        PageBean<Student> pageBeanDB = new PageBean<Student>();
        pageBeanDB.setCurrPage(currentPage);

        PageBean<Student> pageBean;

        String cache_key=RedisCache.CAHCENAME+"|PageBean|"+currentPage;
        //先去缓存中取
        pageBean = redisCache.getCache(cache_key, PageBean.class);
        // logger.info("从缓存中取出的pageBean: "+pageBean);
        if(pageBean==null){

            //缓存中没有再去数据库取，并插入缓存（缓存时间为自定义）
            pageBean = PageUtil.getPageBean( studentDao, pageBeanDB);
            // logger.info("从数据库中取出的pageBean: "+pageBean);

            redisCache.putCacheWithExpireTime(cache_key, pageBean, RedisCache.getRandemTime());
            logger.info("put cache with key: "+cache_key);
        }else{
            logger.info("get cache with key: "+cache_key);
        }
        return pageBean;
    }

   // 获得总学生数
    @Override
    public int getSize() {
        String cache_key=RedisCache.CAHCENAME+"|totleSizeOfStu";
        String size = redisCache.getValString(cache_key);
        if(null == size){
            size = studentDao.getSize()+"";
            redisCache.setKeyStringWithExpireTime(cache_key, size, RedisCache.getRandemTime());

            logger.info("put cache with key:  "+cache_key);
        }else{
            logger.info("get cache with key:  "+cache_key);
        }

        return Integer.parseInt(size);
    }

    // 根据id查找学生
    @Override
    public Student findById(int l) {
        String cache_key = RedisCache.CAHCENAME+"|Student|"+l;

        Student stu = redisCache.getCache(cache_key, Student.class);
        if(null == stu){
            stu = studentDao.getObjectById(l);
            if(null != stu){
                redisCache.putCacheWithExpireTime(cache_key,stu,RedisCache.getRandemTime());
                logger.info("put cache with key: "+cache_key);
            }else {
                Student studentNull = new Student();
                studentNull.setP_Name("student_findByid_null");
                redisCache.putCacheWithExpireTime(cache_key, studentNull, 60*4);
                logger.info("put cache with key:  "+cache_key);
            }

        }else{
            logger.info("get cache with key: "+cache_key);
        }

        return stu;
    }


    // 已经找到工作的学生人数
    @Override
    public int onWorkSize() {
        String cache_key=RedisCache.CAHCENAME+"|onWorkSizeOfStu";
        String size = redisCache.getValString(cache_key);
        if(null == size){
            size = studentDao.onWorkSize()+"";
            redisCache.setKeyStringWithExpireTime(cache_key, size, RedisCache.getRandemTime());
            logger.info("put cache with key:  "+cache_key);
        }else{
            logger.info("get cache with key:  "+cache_key);
        }

        return Integer.parseInt(size);
    }

    //  学习某一职业的学生人数
    @Override
    public int countByVocation(int i) {

        String cache_key=RedisCache.CAHCENAME+"|countByVocation|"+i;
        String size = redisCache.getValString(cache_key);
        if(null == size){
            logger.info("No data in cache，go to DB for searching, key is:"+cache_key);
            size = studentDao.countByVocation(i)+"";
            if(null!=size && !"".equals(size)){
                redisCache.setKeyStringWithExpireTime(cache_key, size, RedisCache.getRandemTime());
                logger.info("put cache with key:  "+cache_key);
            }
        }else{
            logger.info("get cache with key:  "+cache_key);
        }

        return Integer.parseInt(size);

    }

    // 增加学生,增加后对总数量加一
    @Override
    public int addStudent(Student student) {

        int i = studentDao.addObject(student);
        if(1 == i){

            long l = redisCache.incrOne(RedisCache.CAHCENAME+"|totleSizeOfStu");
            logger.info("增加了一个学生，所以对totleSizeOfStu加一,加一后为: "+ l);
        }

        return i;
    }

    @Override
    public int updateStudent(Student student) {
        String cache_key = RedisCache.CAHCENAME+"|Student|"+student.getINTID();

        // sql语句那里我做了判断，如果没有更新时间不会执行语句的
        student.setP_updateTime(System.currentTimeMillis());
        int i = studentDao.updateObject(student);
        if(i==1){
            redisCache.deleteCache(cache_key);
            logger.info("delete data with key:"+cache_key+" after updating");
        }
        return i;

    }

    @Override
    public int deleteStudent(int id) {
        String cache_key = RedisCache.CAHCENAME+"|Student|"+id;
        int i = studentDao.deleteObject(id);
        if(1==i){
            redisCache.deleteCache(cache_key);
            logger.info("delete cache with key: "+cache_key);
           /* redisCache.clearCache();
            logger.info("清除所有缓存");*/
        }
        return i;
    }

}
