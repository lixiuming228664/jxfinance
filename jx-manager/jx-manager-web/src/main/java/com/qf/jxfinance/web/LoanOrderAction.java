package com.qf.jxfinance.web;

import com.qf.jxfinance.common.dto.Order;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.vo.LoanOrderCustom;
import com.qf.jxfinance.service.LoanOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: Administrator
 * Date: 2017/11/28
 * Time: 20:11
 * Version:V1.0
 */
@Controller
public class LoanOrderAction {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private LoanOrderService loanOrderService;
    @ResponseBody
    @RequestMapping("/loanOrderList")
    public Result<LoanOrderCustom> loanList(Page page, Order order){
        Result<LoanOrderCustom> rs = null;
        try {
            rs = loanOrderService.loanList(page,order);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return rs;
    }
}
