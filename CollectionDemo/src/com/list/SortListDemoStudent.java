package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListDemoStudent {

	public static void main(String[] args) {
		Studdent s1 = new Studdent(934,"Abc");
		Studdent s2 = new Studdent(374,"Ubc");
		Studdent s3 = new Studdent(34,"Tbc");
		Studdent s4 = new Studdent(734,"Pbc");
		
		List list = new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
class Studdent implements Comparable{
	int rollNo;
	String name;
	public Studdent(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	public String toString() {
		return "Studdent [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	public int compareTo(Object o) {
		Studdent std = (Studdent)o;
		//return -(this.rollNo-std.rollNo);
		return -(this.name.compareTo(std.name));//acs codes 
	}
}