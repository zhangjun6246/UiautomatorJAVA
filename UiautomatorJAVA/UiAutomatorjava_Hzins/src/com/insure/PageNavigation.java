package com.insure;

import java.io.IOException;

import android.os.RemoteException;
import android.util.Log;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiWatcher;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.base.PageManner;
import com.base.UiObjectHelper;

public class PageNavigation extends UiAutomatorTestCase{
	UiDevice device =  UiDevice.getInstance();
	 String watcherName = "watcher1";
	 UiObject runte1;
	 protected  PageManner pm=null;
	 public void setUpBeforeClass() throws UiObjectNotFoundException, IOException, RemoteException{
		
		//结束掉正在运行的进程
		 getUiDevice().pressRecentApps();
		 //assertTrue()

			//先删除数据
		 Runtime.getRuntime().exec(" pm clear com.hzins.mobile");
          //返回到桌面
		 getUiDevice().pressHome();
		 //在启动应用
		 Runtime.getRuntime().exec(" am start -n com.hzins.mobile/com.hzins.mobile.act.ACT_Splash"); 
		 
		 device.getInstance().registerWatcher(watcherName, new UiWatcher(){//android.widget.ImageView是导航页第一个页面的控件
			 UiObject runte=new UiObject(new UiSelector().className("android.widget.ImageView"));
					@Override
					public boolean checkForCondition() {
						// TODO Auto-generated method stub
						if(runte.exists())
						{
							int x=device.getInstance().getDisplayWidth();
							int y=device.getInstance().getDisplayHeight();
							device.swipe(600, y/2,x/4,y/2,5);
						}
						Log.d("tag", "成功了点击");
						return true;	
					}
				 });
	
		 ClickEnter();
	     device.removeWatcher(watcherName);
	 }

//删除watcher


public UiObject  Enter(){
	return UiObjectHelper.getUiObjectByBothClassNameAndID("android.widget.ImageView", "com.hzins.mobile:id/bt_ok");
}
 public void ClickEnter() throws UiObjectNotFoundException{
	 Enter().clickAndWaitForNewWindow();
 }
 }
