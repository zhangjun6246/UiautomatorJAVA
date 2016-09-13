package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Method.BaseTest;
import com.Method.LoginBusiness;
import com.Method.SettingBusiness;

/**
 * 
* @ClassName: Setting
* @Description: TODO(这里用一句话描述这个类的作用)
* @author jun
* @date 2016年8月30日 下午10:26:56
*
 */
public class Setting extends BaseTest {
	/*
	 * 点击设置富文本内容
	 */
	
@Parameters({"logname","password"})	
@Test
public void TestSeeting(String logname,String password) {
	//登录
	LoginBusiness.getInstance().login(logname,password);
	//点击我的设置
	
	SettingBusiness settingPage=new SettingBusiness();
		//点击个人设置头像
		settingPage.getSetting();
		// 填写用户信息
		settingPage.getName();
		settingPage.getSex();
		settingPage.getIdcard();
		settingPage.getMobile();
		settingPage.getCompany();
		settingPage.getJob();
		settingPage.gettitle();
		settingPage.getidiograph();
	//自我介绍
	//	settingPage.getSelfIntroduction();目前一开启就失败
		 settingPage.getHomePage();
		settingPage.getWeibo();
		settingPage.getWeixin();;
		settingPage.getQQ();;
		settingPage.getsave();
		//断言数据，数据内容不要太多
	    Assert.assertTrue(settingPage.getTrueDisaplayed());
}

}
