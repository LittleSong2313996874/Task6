package com.ss.util.others;

import com.ss.Dao.GeneralDao;
import com.ss.pojo.PageBean;

import java.util.HashMap;
import java.util.List;

public class PageUtil {

    static HashMap<String, Object> map = new HashMap<String, Object>();

    public static PageBean getPageBean(GeneralDao dao, PageBean pageBean) throws RuntimeException {


        //每页显示的数据默认为8

        //封装总记录数
        int totalCount = dao.getSize();
        pageBean.setTotalCount(totalCount);

        //封装总页数
        int totalPage = 0;

        if (totalCount % pageBean.getPageSize() == 0)
            totalPage = totalCount / pageBean.getPageSize();
        else
            totalPage = totalCount / pageBean.getPageSize() + 1;

        pageBean.setTotalPage(totalPage);

        map.put("start", (pageBean.getCurrPage() - 1) * pageBean.getPageSize());
        map.put("size", pageBean.getPageSize());

        //封装每页显示的数据
        List lists = dao.findByPage(map);
        pageBean.setLists(lists);

        // map 用完后要清空，map.clear 清空所有
        map.clear();

        return pageBean;
    }

}
