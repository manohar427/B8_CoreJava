package com.map;

import java.util.Map;

public class LinkedHashMap {

	public static void main(String[] args) {
      
      Map map = new java.util.LinkedHashMap();
      map.put(12, "Abc1");
      map.put(12, "Abc2");
      map.put(13, "Def");
      map.put(17, "Pqr");
      map.put(100, null);
      map.put(null, null);
      map.put("Xyz", "8878");
      
      System.out.println(map);
	}

}
