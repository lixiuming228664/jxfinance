package com.qf.jxfinance.service.impl;

import com.qf.jxfinance.common.dto.Order;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.dao.UserCustomMapper;
import com.qf.jxfinance.dao.UserMapper;
import com.qf.jxfinance.pojo.po.User;
import com.qf.jxfinance.pojo.po.UserExample;
import com.qf.jxfinance.pojo.vo.UserCustom;
import com.qf.jxfinance.pojo.vo.UserQuery;
import com.qf.jxfinance.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.cci.core.RecordCreator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserCustomMapper userCustomDao;

    @Autowired
    UserMapper userDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 根据条件查询用户
     * @param page
     * @return
     */
    @Override
    public Result<UserCustom> listUser(Page page, Order order, UserQuery query) {
        Result<UserCustom> result = null;
        try {

            //查询总记录数
            long total = userCustomDao.countUser(query);
            //查询每页的数据
            List<UserCustom> list = userCustomDao.listUser(page,order,query);
            //将数据封装入result
            result = new Result<UserCustom>();
            result.setTotal(total);
            result.setRows(list);

        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
        return result;
    }

    /**
     * 逻辑删除用户
     * @param ids
     * @return
     */
    @Override
    public int batchLogicalDel(List<Long> ids) {
        int i =0;
        try {
            User record = new User();
            record.setState(3);
            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            i = userDao.updateByExampleSelective(record,example);

        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
        return i;
    }

    /**
     * 批量激活会员
     *
     * @param ids
     * @return
     */
    @Override
    public int batchActive(List<Long> ids) {
        int i =0;
        try {
            User record = new User();
            record.setState(1);
            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            i = userDao.updateByExampleSelective(record,example);

        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
        return i;
    }

    /**
     * 批量禁用会员
     *
     * @param ids
     * @return
     */
    @Override
    public int batchForbid(List<Long> ids) {
        int i =0;
        try {
            User record = new User();
            record.setState(2);
            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            i = userDao.updateByExampleSelective(record,example);

        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
        return i;
    }

}
