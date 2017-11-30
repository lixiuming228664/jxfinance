package com.qf.jxfinance.dao;

import com.qf.jxfinance.pojo.vo.CurrentCustom;

import java.util.List;
import java.util.Map; /**
 * User: Administrator
 * Date: 2017/11/28
 * Time: 17:57
 * Version:V1.0
 */
public interface CurrentCustomMapper {

    long countCurrents(Map<String, Object> map);

    List<CurrentCustom> listCurrents(Map<String, Object> map);
}
