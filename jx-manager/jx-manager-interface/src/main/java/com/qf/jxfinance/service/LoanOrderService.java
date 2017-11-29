package com.qf.jxfinance.service;

import com.qf.jxfinance.common.dto.Order;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.vo.LoanOrderCustom;

/**
 * User: Administrator
 * Date: 2017/11/28
 * Time: 20:18
 * Version:V1.0
 */
public interface LoanOrderService {
    Result<LoanOrderCustom> loanList(Page page, Order order);
}
