package com.qf.jxfinance.dao;

import com.qf.jxfinance.pojo.po.InsuranceProduct;
import com.qf.jxfinance.pojo.po.InsuranceProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InsuranceProductMapper {
    int countByExample(InsuranceProductExample example);

    int deleteByExample(InsuranceProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InsuranceProduct record);

    int insertSelective(InsuranceProduct record);

    List<InsuranceProduct> selectByExampleWithBLOBs(InsuranceProductExample example);

    List<InsuranceProduct> selectByExample(InsuranceProductExample example);

    InsuranceProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InsuranceProduct record, @Param("example") InsuranceProductExample example);

    int updateByExampleWithBLOBs(@Param("record") InsuranceProduct record, @Param("example") InsuranceProductExample example);

    int updateByExample(@Param("record") InsuranceProduct record, @Param("example") InsuranceProductExample example);

    int updateByPrimaryKeySelective(InsuranceProduct record);

    int updateByPrimaryKeyWithBLOBs(InsuranceProduct record);

    int updateByPrimaryKey(InsuranceProduct record);
}