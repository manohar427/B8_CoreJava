package com.test;

public class ExceptionDemo2 {

	public static void main(String[] args) {
          int avg = 0 ; 
		
		try{
			avg = 100/0;
			System.out.println("Avg="+avg);
			//
			//
			//
		}finally{
			System.out.println("I am from finally block.");
		}
		System.out.println("Avg Calculation is Done.");
	}

}
