package com.exception;

//if super class dont have any Exeption subclass dont have any Exception otherwise Unchecked Exception
import java.io.IOException;

class Parent {
	void msg() {
		System.out.println("i am from the super class...");
	}
}

public class ChaildDemo extends Parent {
	 public void msg() throws ArithmeticException {
		System.out.println("i am fomr the subclass......");
	}

	public static void main(String[] args) {
		ChaildDemo cd=new ChaildDemo();
		cd.msg();
		for(int i=0;i<=2;i++)
		{
			cd.main(args);
		}
	}
}
