package com.qf.jxfinance.dao;

import com.qf.jxfinance.pojo.po.FcCompany;
import com.qf.jxfinance.pojo.po.Fixedtime;

import java.util.List;
import java.util.Map;

public interface FcCompanyCustomMapper {
    Long countItemsfc(Map<String, Object> map);

    List<FcCompany> listItemByPagefc(Map<String, Object> map);
}
