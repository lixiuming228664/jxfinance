package com.qf.jxfinance.dao;

import com.qf.jxfinance.pojo.po.InsuranceOrder;
import com.qf.jxfinance.pojo.po.InsuranceOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InsuranceOrderMapper {
    int countByExample(InsuranceOrderExample example);

    int deleteByExample(InsuranceOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InsuranceOrder record);

    int insertSelective(InsuranceOrder record);

    List<InsuranceOrder> selectByExample(InsuranceOrderExample example);

    InsuranceOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InsuranceOrder record, @Param("example") InsuranceOrderExample example);

    int updateByExample(@Param("record") InsuranceOrder record, @Param("example") InsuranceOrderExample example);

    int updateByPrimaryKeySelective(InsuranceOrder record);

    int updateByPrimaryKey(InsuranceOrder record);
}