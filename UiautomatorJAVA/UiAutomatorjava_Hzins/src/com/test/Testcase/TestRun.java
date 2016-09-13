package com.test.Testcase;

import java.io.FileNotFoundException;
import java.io.IOException;




import junit.framework.Assert;



import android.os.RemoteException;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.base.BasicTestCase;
import com.base.PageManner;
import com.insure.PageNavigation;

/**
 * 
 * @author 张君
 *
 */
public class TestRun extends PageNavigation{
	PageManner	pm= new PageManner();
/**
 * 登录选择产品
 * @throws 
 */
//	public static void main(String[] args) throws FileNotFoundException {
//	String workspase,classname,jarname,androidID,sdkpath;
//	workspase="E:\\Soft\\test\\Hzins_Ad";
//	classname="com.test.Testcase.TestRun";
//	jarname="hzins";
//	androidID="1";
//	sdkpath="E:\\Soft\\JAVA\\adt-bundle-windows-x86_64-20131030\\sdk";
//	CtsHelper cts=new CtsHelper(workspase,classname,jarname,androidID,sdkpath);
//	cts.setDevices("2a2ce93");
//	cts.runTest();
//		
//	}
	
	public void testHomeProducts() throws UiObjectNotFoundException{
		try {
			this.setUpBeforeClass();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			Assert.fail("进入到产品首页失败");
		}
		//选择产品列表
	pm.getPageHomePage().ClickPageHome();
	//选择挑选产品
	pm.getPageHomePage().Clickproducts();
	String productlist; 
	//进入到产品列表
	productlist= pm.getPageSelectionMold().gettitile();
	System.out.println("--------"+productlist+"--------");
	assertEquals("没有进入到产品列表页","人身意外保险",productlist);
	//进入到产品列表，选择某种类别的产品
	pm.getPageSelectionMold().ClickSelectionMold();	
	}
	
	
	
	/**
	 * 1.进入到已分类的产品列表页面
	 * 2.选取需要测试的产品
	 * 3.获取产品详情内容
	 */
	public void testTestProduct(){
		
		pm.getPageSelectionProducts().OpenView();
		String ProductDetails=pm.getPageAnInsurance().gettitile();
		System.out.println("--------"+ProductDetails+"--------");
		//断言是否进入到了产品详情页
		assertEquals("没有进如到产品详情页","产品详情",ProductDetails);
		//点击详情中的立即投保按钮
		pm.getPageAnInsurance().ClickCover();	
	}
	
	/**
	 * 登录用户
	 */
   public void testTestlogin(){
	  pm.getPageLogin().login("zhangjun1234","zhangjun123");
	  String ProductDetails=pm.getPageAnInsurance().gettitile();
		//断言已登录成功，跳会到产品详情页
	  System.out.println("--------"+ProductDetails+"--------");
		assertEquals("用户登录不成功不进入产品详情页","产品详情",ProductDetails);
		//点击详情中的立即投保按钮
		pm.getPageAnInsurance().ClickCover();	
	   
   }
   /**
    * 产品投保
    */
//   public void testInsure(){
//	  
//	   try {
//		   pm.getPageFillInformation().ClickHoldingTime();
//		pm.getPageFillInformation().EnterInsuranceInformation("zhangsan","1234567890","18576694589","8956@qq.com");
//		pm.getPageFillInformation().EnterOtherInsurer("junjun", "18576687845", "784565@qq.com");
//		pm.getPageFillInformation().Submit();
//		String Insuresuccess=pm.getPagePay().gettitile();
//		 System.out.println("--------"+Insuresuccess+"--------");
//		//断言投保成功
//			assertEquals("没有进如到支付页面","确认并支付",Insuresuccess );
//	} catch (UiObjectNotFoundException e) {
//		// TODO Auto-generated catch block
//		Assert.fail("没有进入到支付页面");
//		e.printStackTrace();
//	}
//	   
//   }
}
	
