package com.map;

import java.util.HashMap;
import java.util.Map;



public class StudentHashMap {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		Studdent s1 = new Studdent(934,"Abc");
		Studdent s2 = new Studdent(934,"Abc");
		Studdent s3 = new Studdent(934,"Abc");
		Studdent s4 = new Studdent(734,"Pbc");
		
	       map.put(s1, "Abc1");
	       map.put(s2, "Def");
	       map.put(s3, null);
	       map.put(s4, "8878");
	       
	       System.out.println(map);

	}

}

class Studdent{
	int rollNo;
	String name;
	public Studdent(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	public String toString() {
		return "Studdent [rollNo=" + rollNo + ", name=" + name + "]";
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNo;
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studdent other = (Studdent) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}
	
	
}
