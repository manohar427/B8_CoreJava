package com.test;

public class ExceptionDemo4 {

	public static void main(String[] args) {
          String names[] = {"Abc","pqr","Xyz"};
		
          
          int marksList[] = {10,23,45,11,333,3,90};
          int age = 10;
          
		try{
			//DB Connection .. db conn open here
			String name = names[100];
			System.out.println("NAME:"+name);
			//
			//
			//
		}catch(Exception e){
			System.out.println("problen occured while calculating Name");
			e.printStackTrace();
		}
		finally{
			System.out.println("I am from finally block.");
			//DB conn close
		}
		System.out.println("Name Calculation is Done.");
	}

}
