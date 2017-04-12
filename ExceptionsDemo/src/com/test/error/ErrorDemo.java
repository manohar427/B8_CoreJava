package com.test.error;

public class ErrorDemo {

	public static void main(String[] args) {
      m1();
	}

	public static void m1() {
		
		System.out.println(" I am from m1()");
		m2();
	}

	public static void m2() {
		System.out.println(" I am from m2()");
		m1();
	}

}
