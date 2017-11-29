package com.qf.jxfinance.web;

import com.qf.jxfinance.common.dto.Order;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.User;
import com.qf.jxfinance.pojo.vo.UserCustom;
import com.qf.jxfinance.pojo.vo.UserQuery;
import com.qf.jxfinance.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserAction {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;

    /**
     * 根据条件分页查询用户
     * @param page
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public Result<UserCustom> listUser(Page page, Order order, UserQuery query){

        Result<UserCustom> result = null;
        try {

            result = userService.listUser(page,order,query);

        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "user/batchLogicalDel",method = RequestMethod.POST)
    public int batchLogicalDel(@RequestParam("ids[]") List<Long> ids){
        int i =0;
        try {

            i = userService.batchLogicalDel(ids);

        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
        return i;
    }

    /**
     * 批量禁用会员
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "user/batchForbid",method = RequestMethod.POST)
    public int batchForbid(@RequestParam("ids[]") List<Long> ids){
        int i =0;
        try {

            i = userService.batchForbid(ids);

        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
        return i;
    }

    /**
     * 批量激活会员
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "user/batchActive",method = RequestMethod.POST)
    public int batchActive(@RequestParam("ids[]") List<Long> ids){
        int i =0;
        try {

            i = userService.batchActive(ids);

        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
        return i;
    }



}
