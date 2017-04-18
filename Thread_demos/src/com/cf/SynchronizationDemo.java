package com.cf;

public class SynchronizationDemo {

	public static void main(String[] args) {

		Bank b = new Bank();
		Person p1 = new Person(b);
		Person p2 = new Person(b);
		
		p1.start();
		p2.start();
	}
}

class Person extends Thread {

	Bank bank;

	public Person() {

	}

	public Person(Bank bank) {
		this.bank = bank;
	}

	public void  run() {
		try {
			bank.fundsTransfer();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Bank {

	public synchronized void fundsTransfer() throws InterruptedException {
		System.out.println("Debit amount ...from 101982374");
		Thread.sleep(3000);
		System.out.println("Credit amount ... XXXXXXXX");
	}
}