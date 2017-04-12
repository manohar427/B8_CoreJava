package com.test;

public class InterfaceDemo {

	public static void main(String[] args) {
		//House house = new House();
		
		int area = House.area;
		//House.area = 1300;
		
		String myAddress = House.address;
		
		A.getAddress();
		A.age = 12;
	}

	
	

}


class A
{
	 static int age =10;
	public  static void getAddress(){
		System.out.println("This is my adrress");
	}
	
	public  void getMyMakrs(){
		System.out.println("This is my adrress");
	}
	
}