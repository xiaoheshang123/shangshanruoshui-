package com.oracle.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 Set:�����Ҳ����ظ���
 	����:�����˳���ȡ����˳��һ��
 	�����ظ�:��װ���������,�ȱȽ�hashcode,Ȼ�����equals�Ƚ�,��ͬ�����,����ͬ�����
 		�Զ������,�޷��Զ��Ľ��бȽ�,��Ϊ�Ƚϵ��Ƕ����ַ
 		
 	���ȱȽϹ�ϣ��ֵ�Ƿ�һ��,���һ��,������Ƚ����������Ƿ�һ��,
 */
public class SetDemo {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		//��set��������Ӷ���
//		set.add("java01");//String str = new String("java01");
//		set.add("java02");
//		set.add("java02");
//		set.add("java03");
//		set.add("java04");
//		set.add("java04");
//		set.add(4);//Integer i = new Integer(4);-�Զ�װ��
		
		//��set�����д洢�Զ������
//		Person p1 = new Person("zhangsan",10);
//		set.add(p1);
		set.add(new Person("����",10));//���д���,�൱���ϱ����д���ļ�д
		set.add(new Person("����",10));
		set.add(new Person("����",10));
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
		//�����������hashcodeһ��ʱ,������Ƚ����������Ƿ�һ��
		System.out.println("p1��p2�Ƿ�һ��?="+p1.equals(p2));
		//�Ƚϵ���Person�����Object����,�����ǱȽϵ�Person�����е�����ֵ,
		//����˵.��ʱ����Ӧ�ö�equals������д,��������бȽϵ����ݸ�Ϊ����ֵ�ıȽ�
		//this.name==p1.name && this.age==age &&
//		//����
//		Iterator item = set.iterator();
//		while(item.hasNext()){//�ж��Ƿ���Ԫ��
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
//	@Override//��д�˷���
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		if (!(obj instanceof Person)) {//�ж�obj�Ƿ�����person
//			return false;
//		}
//		Person p = (Person) obj;
//		System.out.println("??>>"+p.name);
//		return this.name.equals(p.name)&&this.age==p.age;
//	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		//�Ƚϵ��Ǵ���ֵ���ڴ��ַ,������Person������ڴ��ַ
		return super.equals(arg0);
	}
}