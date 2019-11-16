package com.zhangjiawei.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangjiawei.bean.Company;

public interface ComMapper {

	List<Company> getList(@Param("vo")Integer vo,@Param("vo2")Integer vo2);



}
