package com.Method;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public static WebDriver driver=null;
	@BeforeMethod
	public void StartDriver() {
		
		System.out.println("srart selenium");
	 	 driver=new ChromeDriver();
	 	 driver.get("http://www.91testing.net");
	     
	}
	@AfterMethod
	public void tear(){
		driver.close();
		driver.quit();
		
	}
	
}
