package com.qf.jxfinance.dao;

import com.qf.jxfinance.pojo.po.Fixedtime;
import com.qf.jxfinance.pojo.po.FixedtimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FixedtimeMapper {
    int countByExample(FixedtimeExample example);

    int deleteByExample(FixedtimeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Fixedtime record);

    int insertSelective(Fixedtime record);

    List<Fixedtime> selectByExampleWithBLOBs(FixedtimeExample example);

    List<Fixedtime> selectByExample(FixedtimeExample example);

    Fixedtime selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Fixedtime record, @Param("example") FixedtimeExample example);

    int updateByExampleWithBLOBs(@Param("record") Fixedtime record, @Param("example") FixedtimeExample example);

    int updateByExample(@Param("record") Fixedtime record, @Param("example") FixedtimeExample example);

    int updateByPrimaryKeySelective(Fixedtime record);

    int updateByPrimaryKeyWithBLOBs(Fixedtime record);

    int updateByPrimaryKey(Fixedtime record);
}