package com.qf.jxfinance.dao;

import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.pojo.po.User;

import java.util.List;

public interface UserCustomMapper {
    /**
     * 查询符合条件的用户总数
     * @return
     */
    long countUser();

    /**
     * 查询符合条件的一页的数据
     * @param page
     * @return
     */
    List<User> listUser(Page page);
}
