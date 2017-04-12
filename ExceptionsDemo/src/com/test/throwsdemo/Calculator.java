package com.test.throwsdemo;

public class Calculator {

	// User2

	public int calculateAvg(int nm, int di)throws ArithmeticException,ClassNotFoundException {
		int d = 0;

		try {
			d = nm / di;
			
			Class.forName("abc");
			
			//3 rd line  -XYZ Ex
			return d;
		} 
		catch(ClassNotFoundException e){
			throw e;
		}
		catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("Failure happend(User2)");
			throw e;
		}
		catch(Exception e){
			throw e;
		}

	}
}
