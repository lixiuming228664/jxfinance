package com.qf.jxfinance.dao;

import com.qf.jxfinance.pojo.po.Content;
import com.qf.jxfinance.pojo.po.ContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentMapper {
    int countByExample(ContentExample example);

    int deleteByExample(ContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Content record);

    int insertSelective(Content record);

    List<Content> selectByExample(ContentExample example);

    Content selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Content record, @Param("example") ContentExample example);

    int updateByExample(@Param("record") Content record, @Param("example") ContentExample example);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKey(Content record);
}