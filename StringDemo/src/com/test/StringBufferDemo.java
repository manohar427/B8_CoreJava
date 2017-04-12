package com.test;

public class StringBufferDemo {

	public static void main(String[] args) {

		
		String x = "Abc";
		x = x + "Def";
		x = x + "Xyz";
		
		System.out.println(x);
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("Abc");
		sb.append("Def");
		sb.append("Xyz");
		
		System.out.println(sb);
		System.out.println(sb.length());
	}

}
