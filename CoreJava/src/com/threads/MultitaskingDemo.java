package com.threads;
class Sample1 extends Thread
{
	@Override
	public void run() {
		System.out.println("i am form the thread sample1....");
	}
	
}

class Sample2 extends Thread
{
	@Override
	public void run() {
		System.out.println("i am form the thread sample2....");
	}
//	public Sample2 sample2;
}

public class MultitaskingDemo 
{
public static void main(String[] args)
{
	Sample1 sample1=new Sample1();
	Sample2 sample2=new Sample2();
	sample1.start();
	sample2.start();
	
	//sample1.stop();
	//sample2.stop();
}
}
