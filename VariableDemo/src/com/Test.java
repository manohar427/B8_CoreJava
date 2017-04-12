package com;

public class Test {

	public static void main(String[] args) {
    new Customer().printDetails();
	}

}


class Customer{
	
	//
	private int age;//0
	String name;//null
	protected double salary;//0.00
	
	public String getName(){
		String email;
		int x;
		return name;
	}
	public void printDetails(){
		
		System.out.println(age);
		System.out.println(salary);
		System.out.println(name);
		
	}
}