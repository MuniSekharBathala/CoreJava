package com.threads;

class MyThread1 extends Thread{
	@Override
	public void run() {
		System.out.println("My name is Munisekahr...");
		super.run();
	}
	public MyThread1 t1=new MyThread1();
	 public MyThread1 t2=new MyThread1();
	 public MyThread1 t3=new MyThread1();
}
public class Mythread1Manager extends MyThread1
{
 
 public static void main(String[] args) {
	Mythread1Manager mt1=new Mythread1Manager();
	mt1.t1.start();
	mt1.t2.start();
	mt1.t3.start();
}
}
