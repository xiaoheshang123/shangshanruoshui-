package com.oracle.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 使用TreeSet集合,将集合内的字符串按照长度排序,
 	TreeSet :可以自动排序,但是此排序方式不是我们所需要的,
 	自己写  比较器  实现Comparator接口,重写compare这个方法
 */
public class TreeSetPractice {
	public static void main(String[] args) {
		TreeSet set = new TreeSet(new MyCom());
		set.add("bcd");
		set.add("aaa");
		set.add("a");
		set.add("cd");
		set.add("defg");
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
//自定义一个比较器,比较的条件为:元素的长度
class MyCom implements Comparator{

	public int compare(Object arg0, Object arg1) {
		 //首先考虑,传入的arg0和arg1是什么类型,然后将其转换回去
		String s1 = (String) arg0;
		String s2 = (String) arg1;
		//要进行 的比较为两个参数的长度
		int sn1 = s1.length();//获取传入参数的长度
		int sn2 = s2.length();//获取传入参数的长度
		//比较两个字符串的长度大小
		if(sn1>sn2){
			return -1;
		}else if(sn1==sn2){//当两个字符串长度相等时,会将后一个添加进集合的元素删除
			//这时我们需要第二个比较的条件.进行字符串长度相等时的排列
			//equals  --元素如果为String类型,则不需要使用equals,使用comparTo 
			return s1.compareTo(s2);
		}
		return 1;
	}
	
}