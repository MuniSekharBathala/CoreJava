package com.convertion;

public class StringToInt {

	public static void main(String[] args) {
		String s1="201";
		int i=Integer.parseInt(s1);
		System.out.println(i);
		int x=24;
//		String s2=String.valueOf(x);
		String s2=Integer.toString(x);
		System.out.println(s2);
	}
}
