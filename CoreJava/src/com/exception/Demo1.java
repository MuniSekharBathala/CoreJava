package com.exception;

//if super class dont have any Exeption subclass dont have any Exception otherwise Unchecked Exception
import java.io.IOException;

class Parent1 {
	void msg() throws Exception{
		System.out.println("i am from the super class...");
	}
}

public class Demo1 extends Parent {
	 public void msg() throws NullPointerException,ArrayIndexOutOfBoundsException,ArithmeticException {
		System.out.println("i am fomr the subclass......");
	}

	public static void main(String[] args) {
		Demo1 cd=new Demo1();
		cd.msg();
		for(int i=0;i<=2;i++)
		{
			cd.main(args);
		}
	}
}
