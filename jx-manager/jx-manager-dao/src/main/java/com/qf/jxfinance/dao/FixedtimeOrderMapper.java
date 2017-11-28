package com.qf.jxfinance.dao;

import com.qf.jxfinance.pojo.po.FixedtimeOrder;
import com.qf.jxfinance.pojo.po.FixedtimeOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FixedtimeOrderMapper {
    int countByExample(FixedtimeOrderExample example);

    int deleteByExample(FixedtimeOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FixedtimeOrder record);

    int insertSelective(FixedtimeOrder record);

    List<FixedtimeOrder> selectByExampleWithBLOBs(FixedtimeOrderExample example);

    List<FixedtimeOrder> selectByExample(FixedtimeOrderExample example);

    FixedtimeOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FixedtimeOrder record, @Param("example") FixedtimeOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") FixedtimeOrder record, @Param("example") FixedtimeOrderExample example);

    int updateByExample(@Param("record") FixedtimeOrder record, @Param("example") FixedtimeOrderExample example);

    int updateByPrimaryKeySelective(FixedtimeOrder record);

    int updateByPrimaryKeyWithBLOBs(FixedtimeOrder record);

    int updateByPrimaryKey(FixedtimeOrder record);
}