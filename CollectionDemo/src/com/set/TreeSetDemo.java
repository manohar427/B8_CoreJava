package com.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(1992);
        set.add(142);
        set.add(52);
        set.add(678);
        
        System.out.println(set);
        
        Set set1 = new TreeSet();
        set1.add("Dbc");
        set1.add("Abc");
        set1.add("Abc");
        set1.add("Abc");
        
        System.out.println(set1);
        
	}

}
