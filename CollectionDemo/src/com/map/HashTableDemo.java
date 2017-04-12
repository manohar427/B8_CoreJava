package com.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
      
		Map map =  new Hashtable();
		map.put(12, "Abc");
		map.put(null, "Pqr");
		
		System.out.println(map);
	}

}
