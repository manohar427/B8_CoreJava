package com.test;

public class ExceptionDemo3 {

	public static void main(String[] args) {
          int avg = 0 ; 
		
		try{
			avg = 100/0;
			System.out.println("Avg="+avg);
			//
			//
			//
		}catch(Exception e){
			System.out.println("problen occured while calculating Avg");
			e.printStackTrace();
		}
		finally{
			System.out.println("I am from finally block.");
		}
		System.out.println("Avg Calculation is Done.");
	}

}
