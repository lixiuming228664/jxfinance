package com.qf.jxfinance.service.impl;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.dao.LoanCustomMapper;
import com.qf.jxfinance.pojo.po.Loan;
import com.qf.jxfinance.service.LoanService;
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
 * Time: 11:52
 * Version:V1.0
 */
@Service
public class LoanServiceImpl implements LoanService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private LoanCustomMapper loanCustomDao;
    @Override
    public Result<Loan> loanList(Page page) {
        Result<Loan> rs = new Result<Loan>();
        try {
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("page", page);
            List<Loan> loans = loanCustomDao.listLoanByPage(map);
            long counts = loanCustomDao.countLoan();
            rs.setTotal(counts);
            rs.setRows(loans);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return rs;
    }
}
