package com.qf.jxfinance.service;

import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.User;

public interface UserService {
    /**
     * 根据条件查询用户
     */
    Result<User> listUser(Page page);
}
