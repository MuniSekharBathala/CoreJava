package com.threads;

public class MultiTasking  extends Thread
{
	@Override
		public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
//			System.out.println("My Name is AnikKumar.....");
		}
public static void main(String[] args) throws IllegalThreadStateException, InterruptedException {
	MultiTasking t1=new MultiTasking();
	MultiTasking t2=new MultiTasking();
	t1.start();
//	t1.start();
	t1.join();
	t2.start();
	System.out.println("Ending");
}
}
