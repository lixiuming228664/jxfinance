package com.qf.jxfinance.service.impl;

import com.qf.jxfinance.common.dto.Order;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.common.util.IDUtils;
import com.qf.jxfinance.dao.FixedtimeCustomMapper;
import com.qf.jxfinance.dao.FixedtimeMapper;
import com.qf.jxfinance.pojo.po.Fixedtime;
import com.qf.jxfinance.pojo.po.FixedtimeExample;
import com.qf.jxfinance.pojo.vo.FixedtimeQuery;
import com.qf.jxfinance.service.FixedtimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FixedtimeServiceImpl implements FixedtimeService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private FixedtimeCustomMapper fixedtimeCustomMapper;
    @Autowired
    private FixedtimeMapper fixedtimeMapper;
    @Override
    public Result<Fixedtime> listItemsByPageft(Page page,FixedtimeQuery query) {
        Result<Fixedtime> result = null;
        try {
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("page",page);
            map.put("query",query);
            result=new Result<Fixedtime>();
            Long counts=fixedtimeCustomMapper.countItemsft(map);
            result.setTotal(counts);
            List<Fixedtime> list=fixedtimeCustomMapper.listItemByPageft(map);
            result.setRows(list);

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int saveFixtime(Fixedtime fixedtime) {
        int i=0;
        try {
            long id= IDUtils.getItemId();
            fixedtime.setId(id);
            fixedtime.setComid(id);
            fixedtime.setState(1);
            i = fixedtimeMapper.insert(fixedtime);
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int updateBatch(List<Long> ids) {
        int i=0;
        try{
            //准备一个商品，它包含了状态为3的字段
            Fixedtime record = new Fixedtime();
            record.setState(3);
            //创建更新模板
            FixedtimeExample example = new FixedtimeExample();
            FixedtimeExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            //执行查询
            i = fixedtimeMapper.updateByExampleSelective(record, example);
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int downBatch(List<Long> ids) {
        int i=0;
        try{
            Fixedtime record = new Fixedtime();
            record.setState(2);
            //创建更新模板
            FixedtimeExample example = new FixedtimeExample();
            FixedtimeExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            //执行查询
            i = fixedtimeMapper.updateByExampleSelective(record, example);
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int upBatch(List<Long> ids) {
        int i=0;
        try{
            Fixedtime record = new Fixedtime();
            record.setState(1);
            //创建更新模板
            FixedtimeExample example = new FixedtimeExample();
            FixedtimeExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            //执行查询
            i = fixedtimeMapper.updateByExampleSelective(record, example);
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public Fixedtime findById(Long ftid) {
        Fixedtime fixedtime=null;
        try{
            FixedtimeExample example = new FixedtimeExample();
            FixedtimeExample.Criteria criteria = example.createCriteria();
            criteria.andIdEqualTo(ftid);
            List<Fixedtime> fixedtimes = fixedtimeMapper.selectByExample(example);
            fixedtime=fixedtimes.get(0);
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return fixedtime;
    }
}
