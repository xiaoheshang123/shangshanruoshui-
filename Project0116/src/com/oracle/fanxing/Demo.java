package com.oracle.fanxing;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		demo();
	}
	static Scanner sc = new Scanner(System.in);
	public static void demo(){
		while(true){
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			System.out.println("4");
			System.out.println("5�˳�");
			int n=sc.nextInt();
			switch (n) {
			case 1://�˵�
				test();break;
			case 2:break;
			case 3:break;
			case 4:break;
			case 5:
				return;
			default:
				break;
			}
		}
	}
	public static void test(){
		while(true){
//			�˵�
			/*
			 1/
			 2/
			 3/
			 4/������һ��   //�˳��������,��ص���һ�� return;
			 */
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			System.out.println("4");
			System.out.println("5������һ��");
			int n=sc.nextInt();
			switch (n) {
			case 1:break;
			case 2:break;
			case 3:break;
			case 4:break;
			case 5:
				return;
				 

			default:
				break;
			}
		}
	}
}

