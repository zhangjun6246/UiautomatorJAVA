package com.base;

import com.insure.PageAnInsurance;
import com.insure.PageFillInformation;
import com.insure.PageHomePage;
import com.insure.PageLogin;
import com.insure.PageNavigation;
import com.insure.PagePay;
import com.insure.PageSelectionMold;
import com.insure.PageSelectionProducts;

/**
 * 为了对每个页面进行管理
 * @author 张君
 *
 */
public class PageManner {
	
	PageAnInsurance pageAnInsurance;
	PageFillInformation  pageFillInformation;
	PageHomePage pageHomePage;
	PageLogin   pageLogin;
	PageNavigation pageNavigation;
	PageSelectionMold  pageSelectionMold;
	PageSelectionProducts  pageSelectionProducts;
	PagePay  pagepay;
public PageAnInsurance getPageAnInsurance(){
	if(pageAnInsurance==null){
	 pageAnInsurance=new PageAnInsurance();
	}
	return pageAnInsurance;
	
}
public PageFillInformation getPageFillInformation(){
	if(pageFillInformation==null)
	{
	pageFillInformation=new PageFillInformation();
	}
	return pageFillInformation;
} 

    public PageHomePage    getPageHomePage(){
	if(pageHomePage==null)
	{
		pageHomePage=new PageHomePage();
	}
	return pageHomePage;
} 
  
    public PageLogin    getPageLogin(){
	if(pageLogin==null)
	{
		pageLogin=new PageLogin();
	}
	return pageLogin;
} 
    
    public PageNavigation    getPageNavigation(){
    	if(pageNavigation==null)
    	{
    		pageNavigation=new PageNavigation();
    	}
    	return pageNavigation;
    }
   
    public PageSelectionMold    getPageSelectionMold(){
    	if(pageSelectionMold==null)
    	{
    		pageSelectionMold=new PageSelectionMold();
    	}
    	return pageSelectionMold;
    }
   
    public PageSelectionProducts    getPageSelectionProducts(){
    	if(pageSelectionProducts==null)
    	{
    		pageSelectionProducts=new PageSelectionProducts();
    	}
    	return pageSelectionProducts;
    }
    public PagePay    getPagePay(){
    	if(pagepay==null)
    	{
    		pagepay=new  PagePay();
    	}
    	return pagepay;
    }
}
