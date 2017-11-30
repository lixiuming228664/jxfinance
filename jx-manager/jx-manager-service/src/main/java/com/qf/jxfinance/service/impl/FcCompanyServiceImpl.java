package com.qf.jxfinance.service.impl;

import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.common.util.IDUtils;
import com.qf.jxfinance.dao.FcCompanyCustomMapper;
import com.qf.jxfinance.dao.FcCompanyMapper;
import com.qf.jxfinance.dao.FixedtimeCustomMapper;
import com.qf.jxfinance.dao.FixedtimeMapper;
import com.qf.jxfinance.pojo.po.FcCompany;
import com.qf.jxfinance.pojo.po.FcCompanyExample;
import com.qf.jxfinance.pojo.po.Fixedtime;
import com.qf.jxfinance.pojo.po.FixedtimeExample;
import com.qf.jxfinance.pojo.vo.FcCompanyQuery;
import com.qf.jxfinance.pojo.vo.FixedtimeQuery;
import com.qf.jxfinance.service.FcCompanyService;
import com.qf.jxfinance.service.FixedtimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FcCompanyServiceImpl implements FcCompanyService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private FcCompanyCustomMapper fcCompanyCustomMapper;
    @Autowired
    private FcCompanyMapper fcCompanyMapper;
    @Override
    public Result<FcCompany> listItemsByPagefc(Page page, FcCompanyQuery query) {
        Result<FcCompany> result = null;
        try {
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("page",page);
            map.put("query",query);
            result=new Result<FcCompany>();
            Long counts=fcCompanyCustomMapper.countItemsfc(map);
            result.setTotal(counts);
            List<FcCompany> list=fcCompanyCustomMapper.listItemByPagefc(map);
            result.setRows(list);

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int saveFcCompany(FcCompany fcCompany) {
        int i=0;
        try {
            long id= IDUtils.getItemId();
            fcCompany.setId(id);
            fcCompany.setState(1);
            i = fcCompanyMapper.insert(fcCompany);
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
            FcCompany record = new FcCompany();
            record.setState(3);
            //创建更新模板
            FcCompanyExample example = new FcCompanyExample();
            FcCompanyExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            //执行查询
            i = fcCompanyMapper.updateByExampleSelective(record, example);
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
            //准备一个商品，它包含了状态为3的字段
            FcCompany record = new FcCompany();
            record.setState(2);
            //创建更新模板
            FcCompanyExample example = new FcCompanyExample();
            FcCompanyExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            //执行查询
            i = fcCompanyMapper.updateByExampleSelective(record, example);
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
            //准备一个商品，它包含了状态为3的字段
            FcCompany record = new FcCompany();
            record.setState(1);
            //创建更新模板
            FcCompanyExample example = new FcCompanyExample();
            FcCompanyExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            //执行查询
            i = fcCompanyMapper.updateByExampleSelective(record, example);
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}
