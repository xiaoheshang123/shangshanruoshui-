package com.oracle.fanxing;

import java.util.ArrayList;
import java.util.Iterator;
/*
 * 安全机制,用于解决代码可能存在的运行期产生的问题
 * 泛型:约束集合内的元素类型,避免数据元素类型转换时产生ClassCastException异常
 */

public class FanXingDemo {
	public static void main(String[] args) {
		ArrayList<String> set = new ArrayList<String>();
		set.add("bcd");
		set.add("aaa");
		set.add("a");
		set.add("cd");
		set.add("cd");
		set.add("defg");
//		set.add(4);//因为此集合被约束为元素必须是String 类型,所以无法添加int类型
		 
//		Iterator it = set.iterator();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			//it.next():取的是Iterator中的值!!!!
			String str =  it.next();
			System.out.println(str);
		}
	}
	 
} 
