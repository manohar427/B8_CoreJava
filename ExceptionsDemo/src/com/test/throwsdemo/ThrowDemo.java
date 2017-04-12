package com.test.throwsdemo;

public class ThrowDemo {

	public static void main(String[] args) {
//User1 
		
		Calculator calc= new Calculator();
		
		try
		{
			int result = calc.calculateAvg(100, 10);
			System.out.println("Results:"+result);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		
	}

}
