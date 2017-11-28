package com.qf.jxfinance.dao;

import com.qf.jxfinance.pojo.po.InsuranceCompany;
import com.qf.jxfinance.pojo.po.InsuranceCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InsuranceCompanyMapper {
    int countByExample(InsuranceCompanyExample example);

    int deleteByExample(InsuranceCompanyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InsuranceCompany record);

    int insertSelective(InsuranceCompany record);

    List<InsuranceCompany> selectByExampleWithBLOBs(InsuranceCompanyExample example);

    List<InsuranceCompany> selectByExample(InsuranceCompanyExample example);

    InsuranceCompany selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InsuranceCompany record, @Param("example") InsuranceCompanyExample example);

    int updateByExampleWithBLOBs(@Param("record") InsuranceCompany record, @Param("example") InsuranceCompanyExample example);

    int updateByExample(@Param("record") InsuranceCompany record, @Param("example") InsuranceCompanyExample example);

    int updateByPrimaryKeySelective(InsuranceCompany record);

    int updateByPrimaryKeyWithBLOBs(InsuranceCompany record);

    int updateByPrimaryKey(InsuranceCompany record);
}