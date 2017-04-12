package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
        List al = new ArrayList();
        
        al.add(80);
        al.add(40);
        al.add(20);
        al.add("Abc");
        al.add("Abc");
        al.add("Abc");
        al.add("Abc");
        al.add("Abc");
        al.add("Abc");
        
       // System.out.println(al);
        
       Iterator it =  al.iterator();
       while(it.hasNext()){
    	   System.out.println(it.next());
       }
        
       
	}

}
