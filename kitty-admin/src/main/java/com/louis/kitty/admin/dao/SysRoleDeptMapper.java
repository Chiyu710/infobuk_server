package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.SysRoleDept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysRoleDeptMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleDept record);

    int insertSelective(SysRoleDept record);

    SysRoleDept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoleDept record);

    int updateByPrimaryKey(SysRoleDept record);
}