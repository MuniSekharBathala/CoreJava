package com.threads;

class Demo  extends Thread{
  void m() {
		n();
		System.out.println("I am from the m method......");
	}

	 void n() {
		System.out.println("i am form the n method....");
	}
	@Override
	public void run() {
		m();
	}
}

public class ReentrantDemo {
	public static void main(String[] args) {
		ReentrantDemo rn = new ReentrantDemo();
		
		final Demo t1=new Demo();
		t1.start();
		Thread t2=new Thread()
		{
			@Override
			public void run() {
				t1.m();
			}
		};
		t2.start();
	}
}
