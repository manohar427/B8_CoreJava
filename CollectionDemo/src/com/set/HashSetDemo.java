package com.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
       
		Set set = new HashSet();
		
		set.add("Abc");
		set.add("Abc");
		set.add("Abc");
		set.add("Xyz");
		set.add("Xyz");
		set.add(456);
		set.add(356);
		set.add(656);
		
		System.out.println(set);
	}

}
