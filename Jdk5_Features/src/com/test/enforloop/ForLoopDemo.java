package com.test.enforloop;

public class ForLoopDemo {

	public static void main(String[] args) {
           int all[] = {12,45,66,7,77,8,33,3,12312};
           for(int i=0;i<all.length;i++){
        	   System.out.print(all[i]+" ");
           }
           
           System.out.println();
           //JDK 1.5
           for(int i:all){
        	   System.out.print(i+" ");
           }
	}

}
