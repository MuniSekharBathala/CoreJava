package com.string;

import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String....");
		String string=s.nextLine();
		StringBuffer sb1=new StringBuffer(string);
		StringBuffer sb2 =new StringBuffer();
		for (int i = sb1.length()-1; i >=0; i--) {
			sb2=sb2.append(sb1.charAt(i));
		}
		System.out.println(sb2.toString());
	}
}
 