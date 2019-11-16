package com.zhangjiawei.service;

import com.github.pagehelper.PageInfo;
import com.zhangjiawei.bean.Company;

public interface ComService {

	PageInfo getList(Integer pageNum, Integer vo,Integer vo2);

	int add(Company company);
}
