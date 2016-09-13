package com.base;

import java.io.IOException;



import android.bluetooth.BluetoothClass.Device;
import android.os.RemoteException;
import android.util.Log;



import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiWatcher;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;


/**
 * 
 * @author 张君
 *
 */
public class BasicTestCase extends UiAutomatorTestCase{
	String packageName = "com.hzins.mobile";
	String activityName = "com.hzins.mobile.act.ACT_Splash";
	protected PageManner pm = null;
//	UiDevice device =  UiDevice.getInstance();
//	 String watcherName = "watcher1";
	/*
	 * 通过am start命令启动被测试应用，
	 * @see com.android.uiautomator.testrunner.UiAutomatorTestCase#setUp()
	 */
	public void main() throws Exception{

		pm =new PageManner();
		/**
		 *  判断是否锁屏，如果锁屏，唤醒屏幕，解锁，
		 */
		
//		String cmd="cmd /c adb shell am start -n com.hzins.mobile/com.hzins.mobile.act.ACT_Splash";
//		Runtime.getRuntime().exec(cmd);
//              
		//唤醒屏幕
		if(UiDevice.getInstance().isScreenOn()==false)
		  {    //启动屏幕
			UiDevice.getInstance().wakeUp();
			  //解锁
			  ScreenCapture();
		  }		  
         //结束掉正在运行的进程
		UiDevice.getInstance().pressRecentApps();	 
	}


	//向上滑动解锁
	 public void ScreenCapture() throws UiObjectNotFoundException{
			UiObject screen=UiObjectHelper.getUiObjectByResourceId("com.android.keyguard:id/porch_keyguard_view_bottom");
			if(screen.exists()){
				screen.dragTo(720, 500, 8);
			}
		}
	

}

