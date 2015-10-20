package com.threads;

class Customer {
	int amount = 1000;

	synchronized void withdraw(int amount) {
		System.out.println("Going to withDrawing........");
		if (this.amount < amount) {
			System.out.println("You have less balence wait for deposite......");
		}
		try {
			wait();
		} catch (Exception e) {
			// TODO: handle exception
		}
		this.amount -= amount;
		System.out.println("Withdraw is complited........");
	}

	synchronized void deposit(int amount)
	{
		System.out.println("Going to deposit.......");
		this.amount+=amount;
		System.out.println("Deposit complited........");
		notify();
	}

}

public class InterThreadCommunicationDemo {
	public static void main(String[] args) {
		final Customer customer = new Customer();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				customer.withdraw(1500);

			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				customer.deposit(1000);

			}
		};
		t1.start();
		t2.start();
	}
}
