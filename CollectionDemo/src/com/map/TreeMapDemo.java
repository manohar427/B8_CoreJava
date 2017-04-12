package com.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
      Map map = new TreeMap<>();
      
      map.put(12, "Abc1");
      map.put(12, "Abc2");
      map.put(13, "Def");
      map.put(17, "Pqr");
      map.put(100, null);
     // map.put(null, null);
     // map.put("Xyz", "8878");
      
      System.out.println(map);
	}

}
