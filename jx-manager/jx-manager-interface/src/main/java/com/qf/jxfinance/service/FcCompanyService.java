package com.qf.jxfinance.service;

import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.FcCompany;
import com.qf.jxfinance.pojo.vo.FcCompanyQuery;

import java.util.List;

public interface FcCompanyService {
    Result<FcCompany> listItemsByPagefc(Page page, FcCompanyQuery query);

    int saveFcCompany(FcCompany fcCompany);

    int updateBatch(List<Long> ids);

    int downBatch(List<Long> ids);

    int upBatch(List<Long> ids);

    FcCompany findByFCid(long fcid);

    int itemfcupdate(FcCompany fcCompany);
}
