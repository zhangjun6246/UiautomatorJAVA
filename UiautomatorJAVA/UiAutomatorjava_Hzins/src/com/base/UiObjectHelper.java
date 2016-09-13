package com.base;
/**
 * 
 * @author 张君
 *
 */
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;


public class UiObjectHelper {
	/**
	 * 通过文本定位
	 * @param text
	 * @return
	 */
	public static UiObject getUiObjectByText(String text){
		UiObject object = new UiObject(new UiSelector().text(text));
		return object;
	}
	
	/**
	 * 通过类名定位的方法
	 * @param className
	 * @return
	 */
	public static UiObject getUiObjectByClassName(String className){
		UiObject object = new UiObject(new UiSelector().className(className));
		return object;
	}
	
	/**
	 * 通过ID定位的方法
	 * @param id
	 * @return
	 */
	public static UiObject getUiObjectByResourceId(String id){
		UiObject object = new UiObject(new UiSelector().resourceId(id));
		return object;
	}
	
	/**
	 * 通过Content Description定位的方法
	 * @param des
	 * @return
	 */
	public static UiObject getUiObjectByContentDes(String des){
		UiObject object = new UiObject(new UiSelector().description(des));
		return object;
	}
	
	/**
	 * 结合类名和文本一起定位的方法
	 * @param className
	 * @param text
	 * @return
	 */
	public static UiObject getUiObjectByBothClassNameAndText(String className,String text){
		UiObject object = new UiObject(new UiSelector().className(className).text(text));
		return object;
	}
	
	/**
	 * 拥有相同id的不同控件的获取方法
	 * @param id
	 * @param index
	 * @return
	 */
	public static UiObject getUiObjectByIdAndInstanceIndex(String id,int index){
		return new UiObject(new UiSelector().resourceId(id).instance(index));
	}
	/**获得name 和ID
	 * @param name
	 * @param id
	 */
	public static UiObject getUiObjectByBothClassNameAndID(String name,String id)
	{
		return new UiObject(new UiSelector().className(name).resourceId(id));
		}
	/**
	 * 拥有id和text
	 * @param id
	 * @param text
	 * @return
	 */
	public static UiObject getUiObjectByIdAndtext(String id,String text){
		return new UiObject(new UiSelector().resourceId(id).text(text));
	}
}
