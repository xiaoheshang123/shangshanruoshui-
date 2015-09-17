package com.oracle.fanxing;

import java.util.ArrayList;
import java.util.Iterator;

/*
 增强for循环,语法:for(数据类型 变量名:集合或者数组){}
 数组为什么可以使用增强for循环?
 是因为数组的数据类型一致
 集合在不使用泛型时是无法使用增强for循环的,因为集合内的元素类型不一定一致
 当使用泛型后,可以使用增强for循环遍历内容
 */
public class ForEachDemo {
	//{}[]<>()
	//{}:作为主体使用
	//[]:作为定义数组
	//():作为参数使用
	//<>:作为泛型使用了
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("123");
		list.add(",./.");
		list.add("yui");
//		Iterator it = list.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		//增强for循环的一个缺点是什么?无法获取元素的下标值!
		for(String obj:list){
			System.out.println(obj);
		}
	}
}
