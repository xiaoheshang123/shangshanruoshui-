package com.oracle.fanxing;

import java.util.ArrayList;
import java.util.Iterator;

/*
 ��ǿforѭ��,�﷨:for(�������� ������:���ϻ�������){}
 ����Ϊʲô����ʹ����ǿforѭ��?
 ����Ϊ�������������һ��
 �����ڲ�ʹ�÷���ʱ���޷�ʹ����ǿforѭ����,��Ϊ�����ڵ�Ԫ�����Ͳ�һ��һ��
 ��ʹ�÷��ͺ�,����ʹ����ǿforѭ����������
 */
public class ForEachDemo {
	//{}[]<>()
	//{}:��Ϊ����ʹ��
	//[]:��Ϊ��������
	//():��Ϊ����ʹ��
	//<>:��Ϊ����ʹ����
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("123");
		list.add(",./.");
		list.add("yui");
//		Iterator it = list.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		//��ǿforѭ����һ��ȱ����ʲô?�޷���ȡԪ�ص��±�ֵ!
		for(String obj:list){
			System.out.println(obj);
		}
	}
}
