package com.cf;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {

		
		Y y = new Y();
		y.start();
		y.join();
		
		System.out.println("All child thred exeuction is complted !");
	}

}
class Y extends Thread{
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