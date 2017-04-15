package com.cf.sleep;


public class Thread_Sleep_Demp {

	public static void main(String[] args) {
		
		
		MySeconThread mt = new MySeconThread();
		Thread t = new Thread(mt);
		t.start();
		
		
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
class MySeconThread implements Runnable{
	
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}