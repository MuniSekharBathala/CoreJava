package com.exception;

public class MultipleCatchDemo {
	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50 };
		try {
			int i = 20 / 0;
			System.out.println(array[5]);
			// System.out.println(array[5]/0);
		} catch (ArithmeticException |NullPointerException|NumberFormatException| ArrayIndexOutOfBoundsException e) {

			System.out.println(e.hashCode());
			System.out.println(e.toString());
			e.setStackTrace(null);
		}
		System.out.println("done");
	}
}
