package com.zhangjiawei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.zhangjiawei.bean.Company;
import com.zhangjiawei.service.ComService;

@Controller
public class ComController {

	@Autowired
	private ComService service;
	
	@RequestMapping("list")
	public String list(Model model,@RequestParam(defaultValue="1")Integer pageNum,Integer vo,Integer vo2) {
		System.out.println(vo+"======================================"+vo);
		PageInfo info = service.getList(pageNum,vo,vo2);
		
		model.addAttribute("info", info);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("vo", vo);
		model.addAttribute("vo2", vo2);
		return "list";
	}
	

}
