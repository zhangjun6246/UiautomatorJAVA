package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Method.BaseTest;
import com.Method.HeadportaitBusiness;
import com.Method.LoginBusiness;
import com.Method.SettingBusiness;

/**
 * 
* @ClassName: UploadAvatar
* @Description: TODO(这里用一句话描述这个类的作用)
* @author jun
* @date 2016年8月30日 下午10:27:05
*
 */
public class UploadAvatar extends BaseTest{
	
	/*
	 * 登录进入到个人设置中
	 * 在个人设置中选择头像设置
	 * 在选择更改头像
	 * 
	 */
	
@Test
@Parameters({"logname","password"})
public void TestUpload(String logname,String password){
	LoginBusiness.getInstance().login(logname, password);
	SettingBusiness settingbus=new SettingBusiness();
	settingbus.getSetting();
	//使用单例模式调用发放失败SettingBusiness.getInstance().getSetting();
	HeadportaitBusiness headport=new HeadportaitBusiness();
	headport.getImagesetting();
	headport.getclickuploap();
/*
 * 上传头像这里以什么做断言比较好
 */


}
}
