package com.oracle.fanxing;

import java.util.ArrayList;
import java.util.Iterator;
/*
 * ��ȫ����,���ڽ��������ܴ��ڵ������ڲ���������
 * ����:Լ�������ڵ�Ԫ������,��������Ԫ������ת��ʱ����ClassCastException�쳣
 */

public class FanXingDemo {
	public static void main(String[] args) {
		ArrayList<String> set = new ArrayList<String>();
		set.add("bcd");
		set.add("aaa");
		set.add("a");
		set.add("cd");
		set.add("cd");
		set.add("defg");
//		set.add(4);//��Ϊ�˼��ϱ�Լ��ΪԪ�ر�����String ����,�����޷����int����
		 
//		Iterator it = set.iterator();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			//it.next():ȡ����Iterator�е�ֵ!!!!
			String str =  it.next();
			System.out.println(str);
		}
	}
	 
} 
