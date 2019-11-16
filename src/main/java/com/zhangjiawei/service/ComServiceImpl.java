package com.zhangjiawei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangjiawei.bean.Company;
import com.zhangjiawei.mapper.ComMapper;

@Service
public class ComServiceImpl implements ComService{

	@Autowired
	private ComMapper mapper;

	@Override
	public PageInfo getList(Integer pageNum, Integer vo,Integer vo2) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, 3);
		List<Company> list = mapper.getList(vo,vo2);
		PageInfo info = new PageInfo(list);
		return info;
	}

	@Override
	public int add(Company company) {
		// TODO Auto-generated method stub
		
		return 0;
	}


}
