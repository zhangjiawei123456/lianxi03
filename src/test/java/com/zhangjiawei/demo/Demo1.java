package com.zhangjiawei.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.zhangjiawei.util.StringUtils;



public class Demo1 {

	@Test
	public void test() {
		boolean mobile = StringUtils.isMobile("136");
		assertTrue(mobile);
	}
	@Test
	public void test2() {
		boolean mobile = StringUtils.isMobile("13656565656");
		assertTrue(mobile);
	}
	@Test
	public void test3() {
		boolean mobile = StringUtils.isEmail("ss");
		assertTrue(mobile);
	}
	@Test
	public void test4() {
		boolean mobile = StringUtils.isEmail("1@qq.com");
		assertTrue(mobile);
	}
}
