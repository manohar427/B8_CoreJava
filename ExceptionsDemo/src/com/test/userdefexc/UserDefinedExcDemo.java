package com.test.userdefexc;

public class UserDefinedExcDemo {

	public static void main(String[] args)throws CannotDivideZero {
          
		
		try{
			int x =100/0;
		}catch(Exception e){
			
			System.out.println("Error");
			throw new CannotDivideZero("Cannot divide by Zero");
			//e.printStackTrace();
		}
		
	}

}
