package com.cf.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomerManager {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Customer c = new Customer();
		c.setName("Pqr");
		c.setEmail("pqr@email.com");
		c.setPassword("@!#123swwdfsdf");
		c.setSsn("5555555");
		
		File file = new File("Customer.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oost = new ObjectOutputStream(fos);
		
		oost.writeObject(c);
		
		oost.close();
		
		System.out.println("Object creation is done.");
		
		
		/*File file = new File("Customer.txt");
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Customer c = (Customer)ois.readObject();
		
		System.out.println(c.getName());
		System.out.println(c.getEmail());
		System.out.println(c.getPassword());
		System.out.println(c.getSsn());
		ois.close();*/
		
	}

}
