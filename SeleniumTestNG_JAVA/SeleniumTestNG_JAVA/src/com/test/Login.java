package com.test;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Method.BaseTest;
import com.Method.LoginBusiness;

/**
 * 
* @ClassName: Login
* @Description: TODO(这里用一句话描述这个类的作用)
* @author jun
* @date 2016年8月30日 下午10:26:35
*
 */
public class Login extends BaseTest {
	WebDriver Driver;
	LoginBusiness  loginbusiness;
@BeforeClass
public void setUp(){
	loginbusiness=loginbusiness.getInstance();
}
@Test
@Parameters({"logname","password"})
public void testLogin(String logname,String password){
	loginbusiness.LoinTab();
	loginbusiness.inputUserName(logname);
	loginbusiness.inputPassword(password);
	loginbusiness.clickButton(Driver);
     /*
      *设置窗口的大小，这样才能查找到我的学习文案，但是在本电脑里面window里面报错，
      *The method window() is undefined for the type WebDriver.Options
      */
	//driver.manage().window().maximize();
	Assert.assertEquals("我的学习",loginbusiness.getmethod());
	//Assert.assertEquals("我的学习", loginbusiness);
}
}
