package com.qf.jxfinance.service.impl;

import com.qf.jxfinance.common.dto.Order;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.common.util.IDUtils;
import com.qf.jxfinance.dao.CurrentCustomMapper;
import com.qf.jxfinance.dao.CurrentMapper;
import com.qf.jxfinance.pojo.po.Current;
import com.qf.jxfinance.pojo.po.CurrentExample;
import com.qf.jxfinance.pojo.vo.CurrentCustom;
import com.qf.jxfinance.pojo.vo.CurrentQuery;
import com.qf.jxfinance.service.CurrentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 2017/11/27
 * Time: 21:42
 * Version:V1.0
 */
@Service
public class CurrentServiceImpl implements CurrentService{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private CurrentMapper currentDao;
    @Autowired
    private CurrentCustomMapper CurrentCustomDao;

    @Override
    public Result<CurrentCustom> listCurrents(Page page, Order order, CurrentQuery query) {
        Result<CurrentCustom> result = null;
        try {
            //0 封装一个Map
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("page", page);
            map.put("order", order);
            map.put("query", query);
            //1 先查总记录数 int--Long
            long total = CurrentCustomDao.countCurrents(map);
            //2 查询指定页码的记录集合
            List<CurrentCustom> list = CurrentCustomDao.listCurrents(map);
            //3 存放result中
            result = new Result<CurrentCustom>();
            result.setTotal(total);
            result.setRows(list);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int currentsBatch(List<Long> ids) {
        int i = 0;
        try {
            Current record = new Current();
            record.setState( 3);
            //创建模板
            CurrentExample example = new CurrentExample();
            CurrentExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            //执行更新操作
            i = currentDao.updateByExampleSelective(record, example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int saveCurrent(Current current, String content) {
        int i = 0;
        try {
            long itemId = IDUtils.getItemId();
            current.setId(itemId);
            current.setState(1);
            current.setSetTime(new Date());
            current.setMessage(content);
            //数据库 字段有 text 属性 要用 这个方法
            i = currentDao.insertSelective(current);

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int currentsPutAway(List<Long> ids) {
        int i = 0;
        try {
            Current record = new Current();
            record.setState(1);
            //创建模板
            CurrentExample example = new CurrentExample();
            CurrentExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            //执行更新操作
            i = currentDao.updateByExampleSelective(record, example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int currentsSoldOut(List<Long> ids) {
        int i = 0;
        try {
            Current record = new Current();
            record.setState( 2);
            //创建模板
            CurrentExample example = new CurrentExample();
            CurrentExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            //执行更新操作
            i = currentDao.updateByExampleSelective(record, example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }
}
