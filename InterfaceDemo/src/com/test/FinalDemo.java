package com.test;

public  class FinalDemo {

	
	public   void getMyDetails(){
		System.out.println("Below are are my details.");
	}
}


class MyFinalDemo extends FinalDemo{
	
	public void getMyDetails(){
		System.out.println("Below are are my More details.");
	}
}