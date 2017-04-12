package com.test.userdefexc;

public class CannotDivideZero extends Exception{

	public CannotDivideZero(String message) {
		super(message);
	}
	public CannotDivideZero() {
	}
}
