package com.qf.jxfinance.service.impl;

import com.qf.jxfinance.common.dto.Order;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.dao.LoanOrderCustomMapper;
import com.qf.jxfinance.pojo.vo.LoanOrderCustom;
import com.qf.jxfinance.service.LoanOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 2017/11/28
 * Time: 20:19
 * Version:V1.0
 */
@Service
public class LoanOrderServiceImpl implements LoanOrderService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private LoanOrderCustomMapper loanOrderCustomDao;
    @Override
    public Result<LoanOrderCustom> loanList(Page page, Order order) {

        Result<LoanOrderCustom> rs = null;
        try {
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("page", page);
            map.put("order", order);
            long total = loanOrderCustomDao.countLoanOrder();
            List<LoanOrderCustom> list = loanOrderCustomDao.listLoanOrder(map);
            rs = new Result<LoanOrderCustom>();
            rs.setTotal(total);
            rs.setRows(list);

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return rs;
    }
    }
