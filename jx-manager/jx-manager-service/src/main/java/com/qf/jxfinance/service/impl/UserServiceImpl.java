package com.qf.jxfinance.service.impl;

import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.dao.UserCustomMapper;
import com.qf.jxfinance.dao.UserMapper;
import com.qf.jxfinance.pojo.po.User;
import com.qf.jxfinance.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserCustomMapper userCustomDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 根据条件查询用户
     * @param page
     * @return
     */
    @Override
    public Result<User> listUser(Page page) {
        Result<User> result = null;
        try {

            //查询总记录数
            long total = userCustomDao.countUser();
            //查询每页的数据
            List<User> list = userCustomDao.listUser(page);
            //将数据封装入result
            result = new Result<User>();
            result.setTotal(total);
            result.setRows(list);

        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
        return result;
    }
}
