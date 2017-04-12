package com.abs;

public abstract class AbstractClassDemo {

	public String getName(){
		return "Abc";
	}
	
	
	//public abstract String getAddress();
		//
	
}

abstract class A
{
	
}
abstract class B{
	
	abstract void getMyAddress();
	
	public int  getMarks(){
		return 85;
	}
}

class C extends B
{
	void getMyAddress(){
		System.out.println("This is my Address.");
		//100 lines 
	}
}

abstract class D extends B
{
	
}



