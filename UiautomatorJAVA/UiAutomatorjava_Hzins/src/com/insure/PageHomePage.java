package com.insure;



import junit.framework.Assert;
import android.util.Log;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiWatcher;
import com.base.UiObjectHelper;


public class PageHomePage {
	   String titile;
	 /**
	  * 挑选产品
	  * @return
	  */
	 public  UiObject Products(){
		 return UiObjectHelper.getUiObjectByText("挑选产品");
	 }
	 
	/**
	 * 点击产品列表展示产品
	 */
	public void ClickPageHome(){
		try {
			UiObject PageHome=UiObjectHelper.getUiObjectByIdAndtext("com.hzins.mobile:id/tv_pro_module","产品");
			PageHome.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("点击产品列表不成功");
		}
	}
	/**
	 * 点击挑选产品按钮
	 */
	public void Clickproducts(){
		try {
			
			Products().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail("点击挑选产品按钮失败");
		}
	}
	

	
}