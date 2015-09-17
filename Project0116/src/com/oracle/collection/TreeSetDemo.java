package com.oracle.collection;

import java.util.Iterator;
import java.util.TreeSet;

/*
 Set :无序不可重复
 	|--:HashSet:根据元素的哈希码进行存放，取出时也可以根据哈希码快速找到。
 	|--:TreeSet:对加入的元素进行自动排序
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();//
		set.add(new Stu("a",20));
		set.add(new Stu("e",20));
		set.add(new Stu("f",23));
		set.add(new Stu("d",23));
		set.add(new Stu("c",22));
		System.out.println("java01".hashCode());
		System.out.println("java02".hashCode());
		System.out.println("java03".hashCode());
		Iterator item =set.iterator();
		while(item.hasNext()){
			Stu stu =(Stu) item.next();//将获取的元素转换为Stu类型
			System.out.println(stu.name+">>>"+stu.age);
		}
	}
}
//对排序的第一种方式
class Stu implements Comparable{
	String name;
	int age;
	public Stu(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int compareTo(Object arg0) {//用于实现TreeSet集合的自动排序功能
		Stu stu = (Stu) arg0; 
		if(this.age>stu.age){
			return 1;
		}else if(this.age==stu.age){
			//我们所要求的排序条件相同时会自动删除一个,这时就要有第二个排序条件
			if(this.name.hashCode()>stu.name.hashCode()){
				return 1;
			} else if(this.name.hashCode()<stu.name.hashCode()){
				return -1;
			}
			return 0;
		}
		return -1;
	}
	
}