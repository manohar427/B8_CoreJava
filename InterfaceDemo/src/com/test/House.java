package com.test;

public interface House {
	
	static int area = 1200;
	static final String address = "Bangalore,India";
	
    public abstract void getWindows();
    public void getFloor();
    
   /* public void getCeil(){
    	System.out.println("Hi");
    }*/
}

//100 % abstract 
//You are notable to create Object
//By default all the methods are abstract.
//By default all the members/fields are static 
//By default all the members/fields are final 