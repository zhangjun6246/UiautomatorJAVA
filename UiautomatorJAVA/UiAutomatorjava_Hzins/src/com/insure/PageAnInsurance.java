package com.insure;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.base.UiObjectHelper;


public class PageAnInsurance {
	String titile;
	/**
	 * 点击立即投保按钮（预约顾问）
	 */
	 
	 public void ClickCover(){
		 try {
			 UiObject Cover= UiObjectHelper.getUiObjectByIdAndtext("com.hzins.mobile:id/btn_insure_now", "立即投保");
			 Cover.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("没找到到投保按钮");
			e.printStackTrace();
		}
	 }
	   /**
      * 获取产品详情
      * @return
      */
	 public UiObject  product(){
		return  UiObjectHelper.getUiObjectByBothClassNameAndText("android.widget.TextView", "产品详情");
	 }
	
 	public String gettitile() {
		  try {
			titile= product().getText().toString();
			
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("并没有获取到文本内容");
		}
		  return  titile;
		
}
		
}
