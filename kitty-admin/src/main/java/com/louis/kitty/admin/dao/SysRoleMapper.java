package com.louis.kitty.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.louis.kitty.admin.model.SysRole;
@Mapper
public interface SysRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
    
    List<SysRole> findPage();

	List<SysRole> findAll();
	
	List<SysRole> findPageByName(@Param(value="name") String name);
	
	List<SysRole> findByName(@Param(value="name") String name);
}