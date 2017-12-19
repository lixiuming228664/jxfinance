package com.qf.jxfinance.service;

import com.qf.jxfinance.common.dto.MessageResult;
import com.qf.jxfinance.common.dto.Order;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.User;
import com.qf.jxfinance.pojo.vo.UserCustom;
import com.qf.jxfinance.pojo.vo.UserQuery;

import java.util.List;

public interface UserService {
    /**
     * 根据条件查询用户
     */
    Result<UserCustom> listUser(Page page, Order order, UserQuery query);

    /**
     * 批量逻辑删除会员
     * @param ids
     * @return
     */
    int batchLogicalDel(List<Long> ids);

    /**
     * 批量激活会员
     * @param ids
     * @return
     */
    int batchActive(List<Long> ids);

    /**
     * 批量禁用会员
     * @param ids
     * @return
     */
    int batchForbid(List<Long> ids);


    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    MessageResult userLogin(String username, String password);
}
