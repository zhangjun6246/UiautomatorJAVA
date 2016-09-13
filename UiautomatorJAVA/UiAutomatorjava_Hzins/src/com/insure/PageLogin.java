package com.insure;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.base.UiObjectHelper;


public class PageLogin {

	/**
	 * 输入用户名
	 */
	public void Clickname(String wname){
		try {
			UiObject  name=UiObjectHelper.getUiObjectByIdAndtext("com.hzins.mobile:id/edit_text", "手机号/邮箱/会员名");
			name.clearTextField();
			name.setText(wname);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("用户输入用户名为null");
		}
		
	}
	/**
	 * 输入密码
	 */
	public void Clickwpdw(String password){
		try {
			UiObject PassWord=new UiObject(new UiSelector().resourceId("com.hzins.mobile:id/edit_text").instance(1));
			PassWord.clearTextField();
			PassWord.setText(password);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("用户输入密码为null");
			e.printStackTrace();
		}
		
	}
	/**
	 * 点击登录按钮
	 */
	public void ClickButtonl(){
		try {
		 UiObject login=UiObjectHelper.getUiObjectByIdAndtext("com.hzins.mobile:id/btn_login","登录");
		 login.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("没找到到登录按钮");
			e.printStackTrace();
		}
	}
	/**
	 * 获取登录方法
	 * @param username
	 * @param password
	 */
	public void login(String username, String password) {
		Clickname(username);
		Clickwpdw(password);
		ClickButtonl();
	}
	

}
