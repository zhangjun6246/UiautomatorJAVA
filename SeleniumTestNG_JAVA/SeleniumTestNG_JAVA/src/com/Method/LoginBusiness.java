package com.Method;

import org.openqa.selenium.WebDriver;

public class LoginBusiness {
/*
 * 主要实现控件的方法
 * 如查找到控件
 */
/*
 *  单例模式
 */
	private static LoginBusiness loginbusiness=null;
	public static LoginBusiness getInstance(){
		if(loginbusiness==null){
			loginbusiness=new LoginBusiness();
		}
		return loginbusiness;
	}
	public void LoinTab(){
		SeekMethod.getLink("登录", BaseTest.driver).click();
	}
	public void   inputUserName(String name){
		
		SeekMethod.getId((LoginElment.name),BaseTest.driver).sendKeys(name);
	}
     public void   inputPassword(String word){
		
    	 SeekMethod.getName((LoginElment.passWord), BaseTest.driver).sendKeys(word);
	}
      public void clickButton(WebDriver driver){
    	  SeekMethod.getcssSelector(LoginElment.LoginBtn, BaseTest.driver).click();
}
      //做断言使用
      public String getmethod(){
    	  String loginassert=SeekMethod.getXpath(("//li[@class='visible-lg']"),BaseTest.driver).getText();
    	  
    	 return loginassert;
      }
     
      public void login(String userName,String pw){
    	  SeekMethod.getLink("登录", BaseTest.driver).click();
    	  //driver.findElement(By.linkText("登录")).click();
    	  inputUserName(userName);
    	  inputPassword(pw);
    	  clickButton(BaseTest.driver);
    	  
      }
}
