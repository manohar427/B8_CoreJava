package com.test.boxing;

public class BoxingDemo {

	public static void main(String[] args) {
       int age1 =10;//premitive data type
       Integer age2 = new Integer(90);//1.4 //wrapper class 
       int ag = age2.intValue();
       
       System.out.println(ag);
       
       Integer age3 = 90; //1.5 //Boxing
       
       int x = age3; //1.5 //Unboxing
       
       int y = age3.intValue();//1.4 
       
	}

}
