package com.qf.jxfinance.dao;

import com.qf.jxfinance.pojo.vo.LoanOrderCustom;

import java.util.List;
import java.util.Map; /**
 * User: Administrator
 * Date: 2017/11/28
 * Time: 20:24
 * Version:V1.0
 */
public interface LoanOrderCustomMapper {
    long countLoanOrder();

    List<LoanOrderCustom> listLoanOrder(Map<String, Object> map);
}
