package com.qf.jxfinance.dao;

import com.qf.jxfinance.pojo.po.UserProfit;
import com.qf.jxfinance.pojo.po.UserProfitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserProfitMapper {
    int countByExample(UserProfitExample example);

    int deleteByExample(UserProfitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserProfit record);

    int insertSelective(UserProfit record);

    List<UserProfit> selectByExample(UserProfitExample example);

    UserProfit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserProfit record, @Param("example") UserProfitExample example);

    int updateByExample(@Param("record") UserProfit record, @Param("example") UserProfitExample example);

    int updateByPrimaryKeySelective(UserProfit record);

    int updateByPrimaryKey(UserProfit record);
}