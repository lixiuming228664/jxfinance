package com.qf.jxfinance.service.impl;

import com.qf.jxfinance.common.dto.MessageResult;
import com.qf.jxfinance.common.dto.Order;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.common.jedis.JedisClient;
import com.qf.jxfinance.common.util.JsonUtils;
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
import org.springframework.util.DigestUtils;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserCustomMapper userCustomDao;

    @Autowired
    UserMapper userDao;

    @Autowired
    private JedisClient jedisClient;

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

    /**
     * 用户登录
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public MessageResult userLogin(String username, String password) {
        MessageResult mr = null;
        try {
            //先根据用户名查找用户
            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andUserNameEqualTo(username);
            //todo 此处有一个bug
            List<User> userList = userDao.selectByExample(example);
            //1.校验用户名
            if (userList == null || userList.size() == 0) {
                //用户名不存在
                mr = new MessageResult();
                mr.setSuccess(false);
                mr.setMessage("用户名不存在");
                return mr;
            }
            //2.校验密码
            User user = userList.get(0);
            String md5DigestAsHex = DigestUtils.md5DigestAsHex(password.getBytes());

            if(!md5DigestAsHex.equals(user.getLoginPassword())){
                //用户名不存在
                mr = new MessageResult();
                mr.setSuccess(false);
                mr.setMessage("用户名或密码错误");
                return mr;
            }
            //3.用户名和密码均正确 - 把user存入redis缓存服务器
            String token = UUID.randomUUID().toString();
            user.setLoginPassword(null);
            jedisClient.set("TT_TOKEN"+token, JsonUtils.objectToJson(user));
            //设置过期时间
            jedisClient.expire("TT_TOKEN"+token,1800);
            //返回
            mr = new MessageResult();
            mr.setSuccess(true);
            mr.setMessage("登录成功");
            mr.setData(token);//把key中的部分值返回

        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return mr;
    }

}
