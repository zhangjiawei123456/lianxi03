package com.zhangjiawei.demo;

import java.util.Random;

import org.junit.Test;

import com.zhangjiawei.util.StringUtils;



public class Demo2 {

	@Test
	public void test() {
		/*
		 * Random random = new Random(); int a=random.nextInt(10);
		 * System.out.println(a);
		 * 
		 */
		/**
		 * 两位字母+ 随机公司
		 */
		  for (int i = 0; i < 10000; i++) { 
				  String str = "有限公司|股份有限公司|集团有限公司";
					String[] split = str.split("\\|");
				  Random random = new Random();
			        int a=random.nextInt(3);
			        System.out.println("北京"+StringUtils.randomChar(2)+split[a]);
		  }
	}
	/**
	 * 
	    * @Title: getChineseName
	    * @Description: 10000个名字
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void getChineseName() {
			 for (int i = 0; i < 10000; i++) {
				 StringUtils.getChineseName();
			}
				

	}
	/**
	 * 
	    * @Title: getChineseName2
	    * @Description: 以“北京市”开头，后面调用StringUtil.randomChineseString()创建20-40个汉字（
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void getChineseName2() {
		
		for (int i = 0; i < 500; i++) {
			String name="";
			for (int j = 0; j < 20; j++) {
				char randomChar2 = StringUtils.getRandomChar2();
				System.out.print(randomChar2);
				name +=randomChar2;
			}
			System.out.println("北京市"+name);
		}

	}
	@Test
	public void getNum() {
		/*
		 * int Min = 100000; int Max = 1000000000; int result = Min +
		 * (int)(Math.random() * ((Max - Min) + 1)); System.out.println(result);
		 */
		for (int i = 0; i < 1000000; i++) {
			int randomNum = StringUtils.getRandomNum(1000000000, 100000);
			System.out.println(randomNum);
		}
	}
	/**
	 * 
	    * @Title: yingyezhizhaohao
	    * @Description: 调用RandomUtil随机数工具方法生成，以1101开头，加上11位随机数，总共15位。
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void yingyezhizhaohao() {
		for (int i = 0; i < 100000; i++) {
			String a ="";
			for (int j = 0;j < 10; j++) {
				int num = StringUtils.randomNum();
				a+=num;
			}
			System.out.println("1101"+a);
		}
	}
	/**
	 * 
	    * @Title: getid
	    * @Description: 调用RandomUtil随机数工具方法，在公司类型表中的所有id中随机抽
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void getid() {
		int randomNum = StringUtils.getRandomNum(1, 11);
		System.out.println(randomNum);
	}
	/**
	 * 模拟从1980年1月1日至今任意随机日期
	 */
		
}

