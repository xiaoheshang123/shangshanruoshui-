package com.oracle.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new Person1("����",20));
		set.add(new Person1("����",20));
		set.add(new Person1("����",20));
		//hashcode:��person������ڴ��ַ,
		//��ʱ,���ǲ��������ͬ����ֵ�Ķ���,��ô��?
		//�����ֶ��Ľ����е�hashcodeֵ��Ϊһ��!----equals
		//���������ͬ,�򷵻���ͬ��hashcodeֵ,�ڱȽ�����
	}
}	
class Person1{
	String name;
	int age;
	Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	//��д�Ļ�ȡ��ϣ�뷽��
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.age*56;//��ʱ���صĹ�ϣ��ֵ�Ͳ�������ȫһ��
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