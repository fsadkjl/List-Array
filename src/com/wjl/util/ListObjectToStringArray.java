package com.wjl.util;


import java.util.List;

/**
 * 将一切List< string integer long double float>
 * <br>转换为String数组
 * <br>相比1.0简化了代码
 * @author Administrator
 * @version 2.0
 *
 */
public class ListObjectToStringArray {
	
	public static String[] listObjectToStringArray(List<?> list){
		String[] strings = new String[list.size()];
		for (int i = 0; i < strings.length; i++) {
			strings[i] = String.valueOf(list.get(i));
		}
		return strings;
	}
}
