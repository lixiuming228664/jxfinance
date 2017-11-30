package com.qf.jxfinance.dao;

import com.qf.jxfinance.pojo.po.Fixedtime;

import java.util.List;
import java.util.Map;

public interface FixedtimeCustomMapper {
    Long countItemsft(Map<String, Object> map);

    List<Fixedtime> listItemByPageft(Map<String, Object> map);
}
