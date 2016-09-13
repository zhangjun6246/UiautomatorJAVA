package com.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeekMethod {
	 //WebDriver driver=new ChromeDriver();
public static WebElement getLink(String linkText,WebDriver driver){
	WebElement   webelment=driver.findElement(By.linkText(linkText));
	return webelment;
	
}
public  static  WebElement getId(String id,WebDriver driver){
	WebElement  webelement=driver.findElement(By.id(id));
	return webelement;
}
public static WebElement getXpath(String xpath,WebDriver driver){
	WebElement webelement=driver.findElement(By.xpath(xpath));
	return webelement;
			
}
public static WebElement getName(String name,WebDriver driver){
	WebElement webelement=driver.findElement(By.name(name));
	return webelement;
}
public static WebElement getcssSelector(String cssselector,WebDriver driver){
	WebElement webelement=driver.findElement(By.cssSelector(cssselector));
	return webelement;
}
}
