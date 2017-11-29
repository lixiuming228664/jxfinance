package com.qf.jxfinance.service.impl;

import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.common.util.IDUtils;
import com.qf.jxfinance.dao.LoanCustomMapper;
import com.qf.jxfinance.dao.LoanMapper;
import com.qf.jxfinance.pojo.po.Loan;
import com.qf.jxfinance.pojo.po.LoanExample;
import com.qf.jxfinance.service.LoanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Autowired
    private LoanMapper loanDao;
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

    @Override
    public int loansDelete(List<Integer> ids) {
        int i = 0;
        try {
            Loan record = new Loan();
            record.setStatus(2);
            //创建模板
            LoanExample example = new LoanExample();
            LoanExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            //执行更新操作
            i = loanDao.updateByExampleSelective(record, example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }
    @Transactional
    @Override
    public int saveItem(Loan loan) {
        int i = 0;
        try {
            //先存tb_item
            loan.setStatus(1);
            i = loanDao.insertSelective(loan);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

}
