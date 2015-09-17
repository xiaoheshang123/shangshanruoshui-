package com.oracle.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 *假如有一个对象,其中有 姓名,年龄,性别,编号,生日
 *我想使用不同的排序方式,对集合中的对象排序.
 *有:按照姓名排序
 *按照年龄排序,
 *按照编号
 *按照生日 
 *制定一个排序的优先级
 *姓名 第一个
 *年龄第二个
 *性别第三个
 *生日第四个
 * */
public class TreeSetDemo2 {
	public static void main(String[] args) {
//		
		TreeSet set = new TreeSet();
		set.add(new Person3("zhangsan", 20,19990101));
		set.add(new Person3("zhangsan", 18,19990201));
		set.add(new Person3("zhangsan", 25,19991101));
		set.add(new Person3("zhangsan", 13,19981101));
//		Iterator item = set.iterator();
//		while(item.hasNext()){
//			Person3 p = (Person3) item.next();
//			System.out.println(p.name+"....."+p.age+"..."+p.birthday);
//		}
//		System.out.println("_____________________________________--");
//		以后使用数据库时,就方便了
		TreeSet set2 = new TreeSet(new MyComparatorOfBirthday());
		
		Iterator item1 = set.iterator();
		while(item1.hasNext()){
			set2.add(item1.next());
		}
		Iterator item2 = set.iterator();
		while(item2.hasNext()){
			Person3 p = (Person3) item2.next();
			System.out.println(p.name+"....."+p.age+"..."+p.birthday);
		
		}
	}
}
//自定义比较器比较器
//按照年龄比较
class MyComparator implements Comparator{

	public int compare(Object arg0, Object arg1) {
		Person3 p1 = (Person3) arg0;
		Person3 p2 = (Person3) arg1;
		 if(p1.age==p2.age){//凡是两个值相同时,都必须有第二个排序方式的出现
			 				//不然会出现去重的结果
			 return 0;
		 }else if(p1.age>p2.age){
			 return 1;
		 }
		return -1;
	}
	
}
//按照生日排序
class MyComparatorOfBirthday implements Comparator{

	public int compare(Object arg0, Object arg1) {
		Person3 p1 = (Person3) arg0;
		Person3 p2 = (Person3) arg1;
		 if(p1.birthday==p2.birthday){
			 
			 return 0;
		 }else if(p1.birthday>p2.birthday){
			 return 1;
		 }
		return -1;
	}
	
}
class Person3 {

	String name;
	int age;
	int birthday;
	public Person3(String name, int age,int birthday) {
		this.name = name;
		this.age = age;
		this.birthday=birthday;
	}
	
	
}