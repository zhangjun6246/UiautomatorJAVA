package com.insure;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.base.UiObjectHelper;

public class PagePay {
	String titile;
	 public UiObject ConfirmPayment(){
  	   return UiObjectHelper.getUiObjectByText("确认并支付");
     }
	   	public String gettitile() {
			  try {
				titile= ConfirmPayment().getText().toString();
				
			} catch (UiObjectNotFoundException e) {
				// TODO Auto-generated catch block
				Assert.fail("并没有获取到文本内容");
			}
			  return  titile;
			
	}
}
