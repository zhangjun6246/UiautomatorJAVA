package com.insure;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.base.UiObjectHelper;



public class PageSelectionMold {
	String titile;
	 //选择保险项
//	 UiObject  coverage=login.getUiObjectByResourcetext("人身意外保险");
//	 coverage.clickAndWaitForNewWindow();
//	 this.sleep(5000);
     /**
      * 选择险种
      * @return
      */
       public UiObject SelectionMold(){
    	   return UiObjectHelper.getUiObjectByText("人身意外保险");
       }
       /**
        * 点击人身意外保险按钮
        */
       public void ClickSelectionMold(){
    	   try {
			SelectionMold().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
       /**
        * 获取到文本内容
        * @return
        */
   	public String gettitile() {
		  try {
			titile= SelectionMold().getText().toString();
			
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("并没有获取到文本内容");
		}
		  return  titile;
		
}
}
