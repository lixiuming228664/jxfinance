package com.qf.jxfinance.dao;

import com.qf.jxfinance.common.dto.Order;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.pojo.vo.UserCustom;
import com.qf.jxfinance.pojo.vo.UserQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserCustomMapper {
    /**
     * 查询符合条件的用户总数
     * @return
     */
    long countUser(@Param("query") UserQuery query);

    /**
     * 查询符合条件的一页的数据
     * @param page
     * @return
     */
    List<UserCustom> listUser(@Param("page") Page page, @Param("orderdto") Order orderdto, @Param("query") UserQuery query);
}
