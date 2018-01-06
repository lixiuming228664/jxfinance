package com.qf.jxfinance.service;

<<<<<<< Updated upstream
import com.qf.jxfinance.pojo.po.Content;

import java.util.List;

/**
 * User: DHC
 * Date: 2017/12/4
 * Time: 13:57
 * Version:V1.0
 */
public interface ContentService {
    /**
     * 通过分类ID查询内容列表
     * @param cid
     * @return
     */
    List<Content> listContentsByCid(Long cid);
=======
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.Fixedtime;
import com.qf.jxfinance.pojo.vo.FixedtimeQuery;

import java.util.List;

public interface ContentService {
    Result<Fixedtime> searchAll(Page page, FixedtimeQuery query);
>>>>>>> Stashed changes
}
