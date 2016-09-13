package com.Method;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.Readtxt;

public class SettingBusiness {
	//实现单例模式
	private static SettingBusiness settingbusiness=null;
	 public static   SettingBusiness getInstance(){
		 if(settingbusiness!=null){
			 settingbusiness=new SettingBusiness();
		 }
		 return settingbusiness;
	 }
/*
 * 实现每个控件的方法
 */
	 //读取文件内容
	public String filePath = "E:\\senlenium\\Date.txt";
	Readtxt  readtxt=new Readtxt();
	Map<String, String> map=readtxt.readTxtFile(filePath);
	
	//
	public void getSetting(){
		Actions action = new Actions(BaseTest.driver);
		action.clickAndHold(SeekMethod.getXpath(SettingsElment.head,BaseTest.driver)).perform();
		SeekMethod.getLink(SettingsElment.setting, BaseTest.driver).click();
		
	}

	public void   getName(){
		SeekMethod.getId(SettingsElment.name, BaseTest.driver).sendKeys(map.get("name"));
	}
	public void getSex(){
		SeekMethod.getId(SettingsElment.sex, BaseTest.driver).click();
	}
	public void getIdcard(){
		SeekMethod.getId(SettingsElment.idcard, BaseTest.driver).sendKeys(map.get("cd"));
	}
	public void getMobile(){
		SeekMethod.getId(SettingsElment.mobile, BaseTest.driver).sendKeys(map.get("mobile"));
	}
	
	public void getCompany(){
		SeekMethod.getId(SettingsElment.company, BaseTest.driver).sendKeys(map.get("company"));
	}
	public void getJob(){
		SeekMethod.getId(SettingsElment.job, BaseTest.driver).sendKeys(map.get("job"));
	}
	public void gettitle(){
		SeekMethod.getId(SettingsElment.title, BaseTest.driver).sendKeys(map.get("title"));
	}
	public void getidiograph(){
		SeekMethod.getXpath(SettingsElment.idiograph, BaseTest.driver).sendKeys(map.get("qianming"));
	}
	public void getHomePage(){
		SeekMethod.getXpath(SettingsElment.homepage, BaseTest.driver).sendKeys(map.get("map"));
	}
	public void getWeibo(){
		SeekMethod.getId(SettingsElment.weibo, BaseTest.driver).sendKeys(map.get("weibo"));
	}
	public void getWeixin(){
		SeekMethod.getId(SettingsElment.weixin, BaseTest.driver).sendKeys(map.get("weixin"));
	}
	public void getQQ(){
		SeekMethod.getId(SettingsElment.QQ, BaseTest.driver).sendKeys(map.get("qq"));
	}
	public void getsave(){
		SeekMethod.getId(SettingsElment.save, BaseTest.driver).click();
	}
	public void getSelfIntroduction(){
		//自我介绍
		 WebElement xf=BaseTest.driver.findElement(By.tagName("iframe"));
		 BaseTest.driver.switchTo().frame(xf);
		 BaseTest.driver.findElement(By.tagName("body")).sendKeys("测试2内容");;
		 BaseTest.driver.switchTo().defaultContent();
	}
//断言数据
	public boolean  getTrueDisaplayed(){
		boolean save=SeekMethod.getXpath(SettingsElment.getsave, BaseTest.driver).isDisplayed();
		return save;
	}
	
}
