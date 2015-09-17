package com.oracle.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 *������һ������,������ ����,����,�Ա�,���,����
 *����ʹ�ò�ͬ������ʽ,�Լ����еĶ�������.
 *��:������������
 *������������,
 *���ձ��
 *�������� 
 *�ƶ�һ����������ȼ�
 *���� ��һ��
 *����ڶ���
 *�Ա������
 *���յ��ĸ�
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
//		�Ժ�ʹ�����ݿ�ʱ,�ͷ�����
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
//�Զ���Ƚ����Ƚ���
//��������Ƚ�
class MyComparator implements Comparator{

	public int compare(Object arg0, Object arg1) {
		Person3 p1 = (Person3) arg0;
		Person3 p2 = (Person3) arg1;
		 if(p1.age==p2.age){//��������ֵ��ͬʱ,�������еڶ�������ʽ�ĳ���
			 				//��Ȼ�����ȥ�صĽ��
			 return 0;
		 }else if(p1.age>p2.age){
			 return 1;
		 }
		return -1;
	}
	
}
//������������
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