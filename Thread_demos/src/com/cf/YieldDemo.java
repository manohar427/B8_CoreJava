package com.cf;

public class YieldDemo {

	public static void main(String[] args) {
       
		X x1 = new X();
		X x2 = new X();
		X x3 = new X();
		
		x1.start();
		x2.start();
		x3.start();
		
	}

}


class X  extends Thread{
	 
	public void run() {
	  for(int i=0;i<10;i++){
		  if(i%5==0){
			 System.out.println(Thread.currentThread().getName()+":"+i);
		     Thread.yield();
		  }
	  }
	  
	  System.out.println(Thread.currentThread().getName()+": finised exeution");
	}
}