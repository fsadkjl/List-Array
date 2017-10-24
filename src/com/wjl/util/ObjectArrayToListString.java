package com.wjl.util;

import java.util.Arrays;
import java.util.List;

/**
 * 将一切inter string double float数组
 * <br>转换为list< string >
 * <br>如果要只是转为对应的list< Integer >类 直接使用Arrays.asList()就行了
 * @author Administrator
 * @version 2.0
 *
 */
public class ObjectArrayToListString {
	/**
	 * 
	 * @param t 需要转换的 数组对象
	 * @return 返回List< String >
	 */
	public static <T> List<String> objectArrayToListString(T[] t){
		String string[]= new String[t.length];
		for(int i=0;i<t.length;i++){
       	 string[i]=String.valueOf(t[i]);
        }   
   	 	List<String> list=Arrays.asList(string);
		return list;
	}
}
