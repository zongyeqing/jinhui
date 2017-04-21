package com.jinhui.mapper;

import com.jinhui.po.Userpackage;
import com.jinhui.po.UserpackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserpackageMapper {
    int countByExample(UserpackageExample example);

    int deleteByExample(UserpackageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Userpackage record);

    int insertSelective(Userpackage record);

    List<Userpackage> selectByExample(UserpackageExample example);

    Userpackage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Userpackage record, @Param("example") UserpackageExample example);

    int updateByExample(@Param("record") Userpackage record, @Param("example") UserpackageExample example);

    int updateByPrimaryKeySelective(Userpackage record);

    int updateByPrimaryKey(Userpackage record);
}