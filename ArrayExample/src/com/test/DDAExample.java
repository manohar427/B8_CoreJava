package com.test;

public class DDAExample {

	public static void main(String[] args) {
		int marks[][] = {
				{1,4,5},
				{3,5,6,7,7,7,},
				{45,66,777,90}
		};

		for(int i=0;i<marks.length;i++){
			for(int j=0;j<marks[i].length;j++){
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
	}

}
