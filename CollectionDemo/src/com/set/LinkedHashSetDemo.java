package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Set set = new LinkedHashSet();
		
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
