package com.test.access;

import com.test.Student;

public class AccessSpecifierDemo {

	public static void main(String[] args) {
		Student std = new Student();
		
		//Public
		int age  = std.age ;
		String name = std.name;

		//private
		Person p = new Person();
		//int age2 = p.age;
		String name2 = p.name;
		
		
		//default
		//std.address;
	}

}
