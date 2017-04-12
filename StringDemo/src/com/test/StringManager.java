package com.test;

public class StringManager {

	public static void main(String[] args) {
	/*	String name = "AbcAbcAbccz;lcjcJCpJcZLCJLCjCjcjZJCpJ";
		
		int count = name.length();
		
		System.out.println("Count:"+count);

		int temp = 0;
		for(int i =0;i<37;i++){
			if(name.charAt(i)== 'c' || name.charAt(i)== 'C' ){
				temp = temp + 1;//temp++;
			}
		}
		
		System.out.println("c Count:"+temp);
		
		
		String name1 = "Abc";
		String name2 = "abc";
		
		System.out.println("Name1 and Name2:"+name1.equals(name2));
		System.out.println("Name1 and Name2 Case in:"+name1.equalsIgnoreCase(name2));
		
		
		System.out.println("Name1 LowerCase:"+name1.toLowerCase());
		System.out.println("Name1 UpperCase:"+name1.toUpperCase());
		*/
		/*String abc1 = "abc";
		String abc2 = new String("abc");
				
		System.out.println(abc1 == abc2);//F
		System.out.println(abc1.equals(abc2));//T
		
		*/
		
		/*String name3 = "abc";
		String name4 = "abc";
		
		System.out.println(name3 == name4);//T
		System.out.println(name3.equals(name4));//T
*/		
		
		String name3 = new String("abc");
		String name4 = new String("abc");
		
		System.out.println(name3 == name4);//F
		System.out.println(name3.equals(name4));//T
		
		
		//
		String x = "Abc";
		x = x + "Def";
		
	}

}
