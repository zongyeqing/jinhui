package com.jinhui.mapper;

import com.jinhui.po.Pack;
import com.jinhui.po.PackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PackMapper {
    int countByExample(PackExample example);

    int deleteByExample(PackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Pack record);

    int insertSelective(Pack record);

    List<Pack> selectByExample(PackExample example);

    Pack selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Pack record, @Param("example") PackExample example);

    int updateByExample(@Param("record") Pack record, @Param("example") PackExample example);

    int updateByPrimaryKeySelective(Pack record);

    int updateByPrimaryKey(Pack record);
}