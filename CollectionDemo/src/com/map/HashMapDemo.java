package com.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
       Map map = new HashMap();
       map.put(12, "Abc1");
       map.put(12, "Abc2");
       map.put(13, "Def");
       map.put(17, "Pqr");
       map.put(100, null);
       map.put(null, null);
       map.put("Xyz", "8878");
       
       map = Collections.synchronizedMap(map);
       System.out.println(map);
	}

}
