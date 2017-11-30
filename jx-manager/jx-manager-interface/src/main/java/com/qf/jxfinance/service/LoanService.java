package com.qf.jxfinance.service;

import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.Loan;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/28
 * Time: 11:52
 * Version:V1.0
 */
public interface LoanService {
    Result<Loan> loanList(Page page);

    int loansDelete(List<Integer> ids);

    int saveItem(Loan loan);
}
