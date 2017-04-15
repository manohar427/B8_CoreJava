package com.cf.thread;

public class Thread_demo {

	public static void main(String[] args) {
		System.out.println("Main Thread ID:"+Thread.currentThread().getId());
		System.out.println("I am from Main:"+Thread.currentThread().getName());
		MyThread mt = new MyThread();
		mt.setName("My Child Thread");
		mt.start();
	}
}
class MyThread extends Thread
{
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			System.out.println("Child Thread ID:"+Thread.currentThread().getId());
		}
	}
}