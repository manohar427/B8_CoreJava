package com.test.stimport;

import static java.lang.System.out;
import static java.lang.Math.random;
import static com.test.stimport.Person.age;

public class StaticImportDemo {

	public static void main(String[] args) {
     out.println("Hi");
     out.println("Hi");
     
     out.println(random());
     out.println(random());
     
     out.println(age);
     out.println(age);
     out.println(age);
     out.println(age);
     out.println(age);
	}

}

class Person{
	static int age = 100;
}