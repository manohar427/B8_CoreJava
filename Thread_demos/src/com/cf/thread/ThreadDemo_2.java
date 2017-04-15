package com.cf.thread;


public class ThreadDemo_2 {

	public static void main(String[] args) {

		
		System.out.println("Main Thread ID:"+Thread.currentThread().getId());
		System.out.println("Main Thread Pririty:"+Thread.currentThread().getPriority());
		System.out.println("I am from Main:"+Thread.currentThread().getName());
		
		MySeconThread mt = new MySeconThread();
		Thread t = new Thread(mt);
		t.setName("My Child Thread");
		t.setPriority(10);//1-10
		t.start();
		
	}

}
class MySeconThread implements Runnable{
	
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			System.out.println("Child Thread ID:"+Thread.currentThread().getId());
		}
	}
}