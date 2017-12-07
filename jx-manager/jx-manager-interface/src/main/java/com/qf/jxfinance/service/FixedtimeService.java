package com.qf.jxfinance.service;

import com.qf.jxfinance.common.dto.Order;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.Fixedtime;
import com.qf.jxfinance.pojo.vo.FixedtimeQuery;

import java.util.List;

public interface FixedtimeService {
    Result<Fixedtime> listItemsByPageft(Page page, FixedtimeQuery query);

    int saveFixtime(Fixedtime fixedtime);

    int updateBatch(List<Long> ids);

    int downBatch(List<Long> ids);

    int upBatch(List<Long> ids);

    Fixedtime findById(Long ftid);

    int updateFixtime(Fixedtime fixedtime);
}
