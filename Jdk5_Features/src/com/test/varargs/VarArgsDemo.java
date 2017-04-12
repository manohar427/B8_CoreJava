package com.test.varargs;

public class VarArgsDemo {

	public static void main(String[] args) {
          add(10);
	}

	
	public static int add(int a,int b){
		System.out.println("add int,int");
		return a+b;
	}
	
	public static int add(int ... a){
		int sum=0;
		for(int i:a){
			sum = sum +i;
			//sum = 0 + 10;//sum = 10;
			//sum = 10 + 20;//sum=30
		}
		System.out.println("Sum:"+sum);
		return sum;
	}
}
