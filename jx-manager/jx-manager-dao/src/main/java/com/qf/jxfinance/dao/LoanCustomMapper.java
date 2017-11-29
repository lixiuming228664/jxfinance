package com.qf.jxfinance.dao;

import com.qf.jxfinance.pojo.po.Loan;

import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 2017/11/28
 * Time: 11:58
 * Version:V1.0
 */
public interface LoanCustomMapper {
    List<Loan> listLoanByPage(Map<String, Object> map);

    long countLoan();
}
