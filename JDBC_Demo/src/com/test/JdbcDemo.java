package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
       try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","user1","Tester@123");
		Statement stmt =  con.createStatement();
		//ResultSet rs =  stmt.executeQuery("select * from TEST");//TO Retrieve
		//To Insert 
		int rs =  stmt.executeUpdate("insert into test values(15,'jjjjjjjjjj','mno@email.com',13800,'US')");
		
		/*while(rs.next()){
			System.out.println("ID:"+rs.getString("id")+",NAME:"+rs.getString("name")+",EMAIL:"+rs.getString("email")+",SALARY:"+rs.getString("salary")+",COUNTRY:"+rs.getString("country"));
		}*/
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
       catch (SQLException e) {
   		e.printStackTrace();
   	} 
	}

}
