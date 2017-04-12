package com.test.gen;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
	public static void main(String[] args) {
       
		List list = new ArrayList();
		list.add(122);
		list.add("Abc");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Abc");
		list2.add("Abc");
		list2.add("Abc");
	}
}
