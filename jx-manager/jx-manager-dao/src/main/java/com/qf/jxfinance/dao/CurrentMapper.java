package com.qf.jxfinance.dao;

import com.qf.jxfinance.pojo.po.Current;
import com.qf.jxfinance.pojo.po.CurrentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurrentMapper {
    int countByExample(CurrentExample example);

    int deleteByExample(CurrentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Current record);

    int insertSelective(Current record);

    List<Current> selectByExampleWithBLOBs(CurrentExample example);

    List<Current> selectByExample(CurrentExample example);

    Current selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Current record, @Param("example") CurrentExample example);

    int updateByExampleWithBLOBs(@Param("record") Current record, @Param("example") CurrentExample example);

    int updateByExample(@Param("record") Current record, @Param("example") CurrentExample example);

    int updateByPrimaryKeySelective(Current record);

    int updateByPrimaryKeyWithBLOBs(Current record);

    int updateByPrimaryKey(Current record);
}