package com.qf.jxfinance.dao;

import com.qf.jxfinance.pojo.po.LoanOrder;
import com.qf.jxfinance.pojo.po.LoanOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanOrderMapper {
    int countByExample(LoanOrderExample example);

    int deleteByExample(LoanOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoanOrder record);

    int insertSelective(LoanOrder record);

    List<LoanOrder> selectByExample(LoanOrderExample example);

    LoanOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoanOrder record, @Param("example") LoanOrderExample example);

    int updateByExample(@Param("record") LoanOrder record, @Param("example") LoanOrderExample example);

    int updateByPrimaryKeySelective(LoanOrder record);

    int updateByPrimaryKey(LoanOrder record);
}