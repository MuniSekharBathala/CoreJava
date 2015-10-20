package com.threads;

public class DeadLockDemo 
{
public static void main(String[] args) {
	final String s1="Munisekhar";
	final String s2="Ravi";
	Thread t1= new Thread()
	{
		@Override
		public void run() {
			synchronized(s1)
			{
				System.out.println(s1+"locked Resource 1");
			}
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (s2) {
				System.out.println(s1+"Loked Resource 2");

			}
			}
	};
	Thread t2=new Thread()
	{
		@Override
		public void run() {
			synchronized(s2)
			{
				System.out.println(s2+"Locked Resource 2");
			}
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (s1) {
				System.out.println(s2+"Locked resource 1");
			}
		}
	};
	t1.start();
	t2.start();
}
}
