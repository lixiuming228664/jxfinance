package com.qf.jxfinance.dao;

import com.qf.jxfinance.pojo.po.CurrentOrder;
import com.qf.jxfinance.pojo.po.CurrentOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurrentOrderMapper {
    int countByExample(CurrentOrderExample example);

    int deleteByExample(CurrentOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CurrentOrder record);

    int insertSelective(CurrentOrder record);

    List<CurrentOrder> selectByExample(CurrentOrderExample example);

    CurrentOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CurrentOrder record, @Param("example") CurrentOrderExample example);

    int updateByExample(@Param("record") CurrentOrder record, @Param("example") CurrentOrderExample example);

    int updateByPrimaryKeySelective(CurrentOrder record);

    int updateByPrimaryKey(CurrentOrder record);
}