package com.Method;

import org.openqa.selenium.interactions.Actions;

public class HeadportaitBusiness {
public void getImagesetting(){
	SeekMethod.getLink(HeadportraitElment.image, BaseTest.driver).click();;
}

public void getclickuploap(){

	try {
		SeekMethod.getXpath(HeadportraitElment.file, BaseTest.driver).sendKeys("F://123.jpg");
		Thread.sleep(5000);
		SeekMethod.getXpath(HeadportraitElment.save, BaseTest.driver).click();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}
public void getQuit(){
	Actions action = new Actions(BaseTest.driver);
	action.clickAndHold(SeekMethod.getXpath(HeadportraitElment.quit, BaseTest.driver)).perform();
//	getmethod.getLink("∏ˆ»À…Ë÷√", driver).click();
}
public String getAssert(){
	String image=SeekMethod.getXpath(HeadportraitElment.equal, BaseTest.driver).getText();
	return image;
}
}
