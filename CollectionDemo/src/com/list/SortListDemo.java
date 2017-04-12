package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListDemo {

	public static void main(String[] args) {
       List list = new ArrayList();
       list.add(923);
       list.add(273);
       list.add(823);
       list.add(23);
       list.add(239);
       
       System.out.println(list);
       
       Collections.sort(list);
       
       System.out.println(list);
	}

}
