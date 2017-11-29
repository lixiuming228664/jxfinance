package com.qf.jxfinance.service;

import com.qf.jxfinance.common.dto.Order;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.Current;
import com.qf.jxfinance.pojo.vo.CurrentCustom;
import com.qf.jxfinance.pojo.vo.CurrentQuery;

import java.util.List;
/**
 * User: Administrator
 * Date: 2017/11/27
 * Time: 21:38
 * Version:V1.0
 */
public interface CurrentService {
    /**
     * 分页查询
     * @param page
     * @param order
     * @param query
     * @return
     */
    Result<CurrentCustom> listCurrents(Page page, Order order, CurrentQuery query);

    /**
     *修改删除状态
     * @param ids
     * @return
     */
    int currentsBatch(List<Long> ids);

    /**
     * 保存一个活期理财
     * @param current
     * @param content

     * @return
     */
    int saveCurrent(Current current, String content);


    int currentsPutAway(List<Long> ids);

    int currentsSoldOut(List<Long> ids);
}
