package com.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SettingsElment {
	
	public static String head="//li[@class='user-avatar-li nav-hover']";
	public static String setting="个人设置";
	public static String name="profile_truename";
	public static String sex="profile_gender_1";
	public static String idcard="profile_idcard";
	public static String mobile="profile_mobile";
	public static String company="profile_company";
	public static String job="profile_job";
	public static String title="profile_title";//头衔
	//个人签名
	public static String idiograph="//textarea[@id='profile_signature']";
  	//自我介绍
	public static String homepage="//input[@id='profile_site']";
	public static String weibo="weibo";
	public static String weixin="profile_weixin";
	public static String QQ="profile_qq";
	public static String save="profile-save-btn";
	
	//断言数据，保存成功
	public static String getsave="//div[@class='alert alert-success']";
	
	
	//自我介绍
     /*WebElement xf=driver.findElement(By.tagName("iframe"));
     driver.switchTo().frame(xf);
     driver.findElement(By.tagName("body")).sendKeys("测试2内容");;
     driver.switchTo().defaultContent();
    */ 


     
}
