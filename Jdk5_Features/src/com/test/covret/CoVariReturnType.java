package com.test.covret;

public class CoVariReturnType {

	public static void main(String[] args) {
          int x;
	}

}
class A
{
	public A add(){
		return null;
	}
}

class B extends A{
	
	public B add(){
		return null;
	}
}