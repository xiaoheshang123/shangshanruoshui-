package com.oracle.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new Person1("张三",20));
		set.add(new Person1("李四",20));
		set.add(new Person1("张三",20));
		//hashcode:是person对象的内存地址,
		//这时,我们不想存入相同属性值的对象,怎么办?
		//我们手动的将所有的hashcode值改为一样!----equals
		//如果年龄相同,则返回相同的hashcode值,在比较姓名
	}
}	
class Person1{
	String name;
	int age;
	Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	//重写的获取哈希码方法
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.age*56;//这时返回的哈希码值就不可能完全一样
			//21*56
			//20*56
	}
	@Override
	public boolean equals(Object arg0) {
		Person1 p = (Person1) arg0;
		System.out.println(this.name+"......"+p.name);
		return p.name.equals(this.name)&& p.age==this.age;
	}
//	Person p1 = new Person("", 10);
//	Person p2 = new Person("", 10);
//	p1.name.equals(p2.name) && p1.age==p2.age
}