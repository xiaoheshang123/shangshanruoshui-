package com.oracle.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 Set:无序且不可重复的
 	无序:存入的顺序和取出的顺序不一致
 	不可重复:安装存入的内容,先比较hashcode,然后进行equals比较,相同则不添加,不相同则存入
 		自定义对象,无法自动的进行比较,因为比较的是对象地址
 		
 	首先比较哈希码值是否一样,如果一样,则继续比较两个对象是否一样,
 */
public class SetDemo {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		//想set集合中添加对象
//		set.add("java01");//String str = new String("java01");
//		set.add("java02");
//		set.add("java02");
//		set.add("java03");
//		set.add("java04");
//		set.add("java04");
//		set.add(4);//Integer i = new Integer(4);-自动装箱
		
		//向set集合中存储自定义对象
//		Person p1 = new Person("zhangsan",10);
//		set.add(p1);
		set.add(new Person("张三",10));//此行代码,相当于上边两行代码的简写
		set.add(new Person("李四",10));
		set.add(new Person("张三",10));
		set.add("java01");
		set.add("java01");
		String str1 = "java01";
		String str2="java01";
		System.out.println(">>>>"+str1.hashCode());
		System.out.println(">>>>"+str2.hashCode());
		Person p1 = new Person("zhangsan",10);
		Person p2 = new Person("zhangsan",10);
		System.out.println("<<<"+p1.hashCode());
		System.out.println("<<<"+p2.hashCode());
		//当两个对象的hashcode一样时,会继续比较两个对象是否一样
		System.out.println("p1和p2是否一样?="+p1.equals(p2));
		//比较的是Person对象的Object类型,而不是比较的Person对象中的属性值,
		//所以说.这时我们应该对equals进行重写,将里面进行比较的内容改为属性值的比较
		//this.name==p1.name && this.age==age &&
//		//遍历
//		Iterator item = set.iterator();
//		while(item.hasNext()){//判断是否有元素
//			System.out.println(item.next());
//		}
	}
}
class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
////	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return 10;
//	}
//	@Override//重写此方法
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		if (!(obj instanceof Person)) {//判断obj是否属于person
//			return false;
//		}
//		Person p = (Person) obj;
//		System.out.println("??>>"+p.name);
//		return this.name.equals(p.name)&&this.age==p.age;
//	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		//比较的是传入值的内存地址,而不是Person对象的内存地址
		return super.equals(arg0);
	}
}