package com.test.enums;

public class EnumDemo {

	public static void main(String[] args) {
       String month = "APRIL";
       String month1 = "April";
       String month2 = "april";
       
       System.out.println(Months.APR);
       System.out.println(Months.JAN);
       System.out.println(Months.FEB);
       System.out.println(Gender.MALE);
	}
}
enum Months{
	JAN,FEB,MAR,APR,MAY
}

enum Gender{
	MALE,FEMALE
}