package com.insure;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;

public class PageSelectionProducts {
	/**
	 * 查找到产品
	 */
	 public void OpenView(){
			UiScrollable viewlabel=new UiScrollable(new UiSelector().scrollable(true));
			try {
				
				viewlabel.setAsVerticalList().scrollForward();//设置向下滚动，并往前滚动
				viewlabel.getChildByText(new UiSelector().resourceId("com.hzins.mobile:id/tv_pro_list_title"), "一元出行保 ");
				viewlabel.clickAndWaitForNewWindow();
				
			} catch (UiObjectNotFoundException e) {
				// TODO Auto-generated catch block
				Assert.fail("没找到此产品");
				
			}
			
		}
}
