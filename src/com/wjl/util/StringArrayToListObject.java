package com.wjl.util;

import java.util.Arrays;
import java.util.List;
/**
 * 将一切可以转换的string数组 转为
 * <br>List< string integer long double float>
 * @author Administrator
 * @version 2.0
 *
 */
public class StringArrayToListObject {
	
	/**
	 * 注意:<strong><font color="red">String[]中的对象必须可以转换为自己所需的List
	 * 能不能转换自己心里没点B数吗,别乱搞</font></strong>
	 * @param string 需要转换的String[]对象
	 * @param name 需要转换为List的泛型对象
	 * <br>例如需要转为List< Integer >,则name为"integer"或者"Integer"
	 * @return 请将List< ? >改为所需的List对象
	 */
	//当然可以把T换成? 但是为了用户使用不出警告还是使用T吧
	public static List<?> stringToListObject (String [] string,String name){
		if (name.equalsIgnoreCase("string")) {
			List<String> list = Arrays.asList(string);
			return list;
		}else if (name.equalsIgnoreCase("integer")) {
			Integer [] integers = new Integer[string.length];
			try {
				for (int i = 0; i < integers.length; i++) {
					integers[i] = Integer.valueOf(string[i]);
				}
				List<Integer> list = Arrays.asList(integers);
				return list;
			} catch (NumberFormatException e) {
				System.out.println("String能不能转换成"+name+"类型自己心里没点B数吗,瞎几把乱搞！");
				return null;
			}
		}else if (name.equalsIgnoreCase("long")) {
			Long [] longs = new Long[string.length];
			try {
				for (int i = 0; i < longs.length; i++) {
					longs[i] = Long.valueOf(string[i]);
				}
				List<Long> list = Arrays.asList(longs);
				return list;
			} catch (NumberFormatException e) {
				System.out.println("String能不能转换成"+name+"类型自己心里没点B数吗,瞎几把乱搞！");
				return null;
			}
		}else if (name.equalsIgnoreCase("double")) {
			Double [] doubles = new Double[string.length];
			try {
				for (int i = 0; i < doubles.length; i++) {
					doubles[i] = Double.valueOf(string[i]);
				}
				List<Double> list = Arrays.asList(doubles);
				return list;
			} catch (NumberFormatException e) {
				System.out.println("String能不能转换成"+name+"类型自己心里没点B数吗,瞎几把乱搞！");
				return null;
			}
		}else if (name.equalsIgnoreCase("float")) {
			Float [] floats = new Float[string.length];
			try {
				for (int i = 0; i < floats.length; i++) {
					floats[i] = Float.valueOf(string[i]);
				}
				List<Float> list = Arrays.asList(floats);
				return list;
			} catch (NumberFormatException e) {
				System.out.println("String能不能转换成"+name+"类型自己心里没点B数吗,瞎几把乱搞！");
				return null;
			}
		}else {
			System.out.println("请填写正确的name属性:\n例如:您可能把Integer写成了Integerd");
			return null;
		}
	}
}
