package com.qf.jxfinance.dao;

import com.qf.jxfinance.pojo.po.FcCompany;
import com.qf.jxfinance.pojo.po.FcCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FcCompanyMapper {
    int countByExample(FcCompanyExample example);

    int deleteByExample(FcCompanyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FcCompany record);

    int insertSelective(FcCompany record);

    List<FcCompany> selectByExampleWithBLOBs(FcCompanyExample example);

    List<FcCompany> selectByExample(FcCompanyExample example);

    FcCompany selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FcCompany record, @Param("example") FcCompanyExample example);

    int updateByExampleWithBLOBs(@Param("record") FcCompany record, @Param("example") FcCompanyExample example);

    int updateByExample(@Param("record") FcCompany record, @Param("example") FcCompanyExample example);

    int updateByPrimaryKeySelective(FcCompany record);

    int updateByPrimaryKeyWithBLOBs(FcCompany record);

    int updateByPrimaryKey(FcCompany record);
}