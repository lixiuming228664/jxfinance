package com.qf.jxfinance.web;

import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.Loan;
import com.qf.jxfinance.service.LoanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
/**
 * User: Administrator
 * Date: 2017/11/28
 * Time: 11:44
 * Version:V1.0
 */
@Controller
public class LoanAction {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private LoanService loanService;
    @ResponseBody
    @RequestMapping("/loanList")
    public Result<Loan> loanList(Page page){
        Result<Loan> rs = null;
        try {
            rs = loanService.loanList(page);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return rs;
    }
}
