package com.test;

public class ExceptionDemo {

	public static void main(String[] args) {
        
		int avg = 0 ; 
		
		try{
			avg = 100/90;
			System.out.println("Avg="+avg);
			//
			//
			//
		}catch(Exception e){
			System.out.println("problen occured while calculating Avg");
			e.printStackTrace();
		}
		System.out.println("Avg Calculation is Done.");
		
		
	}

}
