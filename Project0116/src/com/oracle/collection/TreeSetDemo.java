package com.oracle.collection;

import java.util.Iterator;
import java.util.TreeSet;

/*
 Set :���򲻿��ظ�
 	|--:HashSet:����Ԫ�صĹ�ϣ����д�ţ�ȡ��ʱҲ���Ը��ݹ�ϣ������ҵ���
 	|--:TreeSet:�Լ����Ԫ�ؽ����Զ�����
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
			Stu stu =(Stu) item.next();//����ȡ��Ԫ��ת��ΪStu����
			System.out.println(stu.name+">>>"+stu.age);
		}
	}
}
//������ĵ�һ�ַ�ʽ
class Stu implements Comparable{
	String name;
	int age;
	public Stu(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int compareTo(Object arg0) {//����ʵ��TreeSet���ϵ��Զ�������
		Stu stu = (Stu) arg0; 
		if(this.age>stu.age){
			return 1;
		}else if(this.age==stu.age){
			//������Ҫ�������������ͬʱ���Զ�ɾ��һ��,��ʱ��Ҫ�еڶ�����������
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