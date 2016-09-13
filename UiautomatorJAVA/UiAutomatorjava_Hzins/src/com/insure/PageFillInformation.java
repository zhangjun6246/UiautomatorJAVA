package com.insure;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.base.UiObjectHelper;




public class PageFillInformation {
	
	 /**
	  * 点击起保时间
	 * @throws UiObjectNotFoundException 
	  */
	 public void ClickHoldingTime() throws UiObjectNotFoundException{
		UiObject holdTime=UiObjectHelper.getUiObjectByText("起保时间");
		holdTime.click();
		 Confirm();
	 }
	 public UiObject  Self() {
		 return UiObjectHelper.getUiObjectByText("本人信息");
	 }
	 /**
	  * 点击填写本人信息
	 * @throws UiObjectNotFoundException 
	  */
	 public void ClickSetSelf() throws UiObjectNotFoundException{
		 Self().clickAndWaitForNewWindow();
	 }
	 public void Tname(String name){
		 
	 }
	 
	 
	 /**
	  * 选择确定按钮，针对不特殊的按钮
	  */
	 public void Confirm(){
		 UiObject  buttont=UiObjectHelper.getUiObjectByIdAndtext("com.hzins.mobile:id/btn_date_picker_ok", "确定");
		 try {
			buttont.click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("没有确定按钮");
		}
	 }
	 
	 /**
	  * 输入投保人姓名
	  * @return
	  */
	 public UiObject InsureName(){
		 return UiObjectHelper.getUiObjectByText("2-50位中英文");
	 }
	 public void SetInsureName(String name) throws UiObjectNotFoundException{
		 InsureName().clearTextField();
		 InsureName().setText(name);
	 }
	 
	 
	 /**
	  * 选择证件类型为其他
	  * @return
	  */
	 public UiObject DocumentType (){
		 return UiObjectHelper.getUiObjectByText("证件类型");
	 }
	 public void ClickDocumentType() throws UiObjectNotFoundException{
		 DocumentType().click();
		 UiObject  choosetype=UiObjectHelper.getUiObjectByText("其他");
		 choosetype.click();
	 }
	 
	 /**
	  * 输入投保人证件号码
	  * @return
	  */
	 public UiObject CertificateNumber (){
		 return UiObjectHelper.getUiObjectByText("有效证件号");
	 }
	 public void SetCertificateNumber(String number) throws UiObjectNotFoundException{
		 CertificateNumber().clearTextField();
		 InsureName().setText(number);
	 }
 
	 /**
	  * 选择出生日期
	  * @return
	  */
	 public UiObject DateBirth (){
		 return UiObjectHelper.getUiObjectByText("出生日期");
	 }
	 public void ClickDateBirth() throws UiObjectNotFoundException{
		 DateBirth().click();
		 UiObject  choosetype=new UiObject(new UiSelector().className("android.widget.Button").index(2).text("name"));
		 choosetype.click();
	 }
	 
	 
	 /**
	  * 选择性别
	  * @return
	  */
	 public UiObject Sex(){
		 return UiObjectHelper.getUiObjectByText("性别");
	 }
	 public void ClickSex() throws UiObjectNotFoundException{
		 Sex().click();
		 UiObject  chooseSex=UiObjectHelper.getUiObjectByResourceId("com.hzins.mobile:id/llayout_dialog");
		 chooseSex.click();
	 }
	 
	 /**
	  * 输入手机号码
	  * @return
	  */
	 public UiObject  Number(){
		 return UiObjectHelper.getUiObjectByIdAndtext("com.hzins.mobile:id/et_model_content", "11位手机号");
	 }
	 public void SetNumber(String Phonenumber) throws UiObjectNotFoundException{
		 Number().clearTextField();
		 Number().setText(Phonenumber);
	 }
	 
	 /**
	  * 输入电子邮件
	  * @return
	  */
	 public UiObject  SetEamil(){
		 return UiObjectHelper.getUiObjectByResourceId("com.hzins.mobile:id/weet_model_content");
	 }
	 public void  SetEamil(String Eamil) throws UiObjectNotFoundException{
		 SetEamil().clearTextField();
		 SetEamil().setText(Eamil);
	 }
	 
	 /**
	  * 公共保存
	  */
	 public UiObject  SaveButton() {
		return UiObjectHelper.getUiObjectByText("保存");
		    
	 }
	 public void ChooseSave1() throws UiObjectNotFoundException{
		 SaveButton().clickAndWaitForNewWindow();
	 }
	 
	 /**
	  * 更换被保险人为丈夫
	  */
	 public UiObject  Chooseinsurance() {
			return UiObjectHelper.getUiObjectByText("我是被保险人的");
			    
		 }
	 public void ClickChooseinsurance() throws UiObjectNotFoundException{
		 Chooseinsurance().clickAndWaitForNewWindow();
		 UiObject chooseman=UiObjectHelper.getUiObjectByText("丈夫");
		 chooseman.click();
		 }
	 /**
	  * 选择投保人
	  * @return
	  */
	 public UiObject Applicant(){
		 return UiObjectHelper.getUiObjectByText("投保人");
	 }
	 public void ClickApplicant(){
		 try {
			Applicant().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 
	 /**
	  * 选择起保时间，并确定
	  * 选择本人信息
	  * 填写本人信息(投保人姓名，证件号码，出生日期，性别,手机号码)
	  * 点击保存
	 * @throws UiObjectNotFoundException 
	  */
	 
	 public void EnterInsuranceInformation(String name,String number,String Phonenumber,String Eamil) throws UiObjectNotFoundException{
		 ClickHoldingTime();
		 Confirm();
		 ClickSetSelf();
		 SetInsureName(name);
		 SetCertificateNumber(number);
		 ClickDateBirth();
		 ClickSex();
		 SetNumber(Phonenumber);
		 SetEamil(Eamil);
		 ChooseSave1();
	 }
	 /**
	  * 选择被保险人的关系,
	  * 投保人信息点击保存就OK
	  * 填入被保险人信息
	 * @throws UiObjectNotFoundException 
	  */
	 public void EnterOtherInsurer(String name,String number,String Eamil) throws UiObjectNotFoundException{
		 ClickChooseinsurance();
		 ClickApplicant();
		 ChooseSave1();
		 ClickChooseinsurance();
		 SetInsureName(name);
		 ClickDocumentType();
		 SetCertificateNumber(number);
		 ClickDateBirth();
		 ClickSex();
		 SetEamil(Eamil);
		 ChooseSave1();
	 }
	 /**
	  * 点击阅读投保申请，点击提交订单
	 * @throws UiObjectNotFoundException 
	  */
	 public void Submit() throws UiObjectNotFoundException{
		 UiObject  agre=UiObjectHelper.getUiObjectByText("已阅读并同意");
		  agre.click();
		 UiObject  submit=UiObjectHelper.getUiObjectByIdAndtext("com.hzins.mobile:id/btn_insure_submit_order", "提交订单");
		 submit.clickAndWaitForNewWindow();
		 
	 }
		
	 
}

