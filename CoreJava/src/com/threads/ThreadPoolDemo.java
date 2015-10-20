package com.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable {
	private String message;  
    public MyThread(String s) {        
    	this.message=s;  
}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"start"+message);
		try {
			time();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"end");

	}
 private void time() throws InterruptedException
 {
	 	Thread.sleep(1000);
 }
}

public class ThreadPoolDemo 
{
public static void main(String[] args) {
	ExecutorService excuter=Executors.newFixedThreadPool(5); 
	for (int i = 0; i < 10; i++) 
	{
		Runnable worker=new MyThread(""+i);
		excuter.execute(worker);
	}
	excuter.shutdown();
	while (!excuter.isTerminated()) 
	{
		
	}
	System.out.println("all worker fineshed their work from first thread pool....");
	ExecutorService excuter1=Executors.newFixedThreadPool(5); 
	for (int i = 0; i < 10; i++) 
	{
		Runnable worker=new MyThread(""+i);
		excuter1.execute(worker);
	}
	excuter1.shutdown();
	while (!excuter1.isTerminated()) 
	{
		
	}
	System.out.println("all worker fineshed their work from second thread pool....");
}
}
