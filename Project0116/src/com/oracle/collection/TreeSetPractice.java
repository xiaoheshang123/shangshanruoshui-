package com.oracle.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 ʹ��TreeSet����,�������ڵ��ַ������ճ�������,
 	TreeSet :�����Զ�����,���Ǵ�����ʽ������������Ҫ��,
 	�Լ�д  �Ƚ���  ʵ��Comparator�ӿ�,��дcompare�������
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
//�Զ���һ���Ƚ���,�Ƚϵ�����Ϊ:Ԫ�صĳ���
class MyCom implements Comparator{

	public int compare(Object arg0, Object arg1) {
		 //���ȿ���,�����arg0��arg1��ʲô����,Ȼ����ת����ȥ
		String s1 = (String) arg0;
		String s2 = (String) arg1;
		//Ҫ���� �ıȽ�Ϊ���������ĳ���
		int sn1 = s1.length();//��ȡ��������ĳ���
		int sn2 = s2.length();//��ȡ��������ĳ���
		//�Ƚ������ַ����ĳ��ȴ�С
		if(sn1>sn2){
			return -1;
		}else if(sn1==sn2){//�������ַ����������ʱ,�Ὣ��һ����ӽ����ϵ�Ԫ��ɾ��
			//��ʱ������Ҫ�ڶ����Ƚϵ�����.�����ַ����������ʱ������
			//equals  --Ԫ�����ΪString����,����Ҫʹ��equals,ʹ��comparTo 
			return s1.compareTo(s2);
		}
		return 1;
	}
	
}