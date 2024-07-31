package com.supraja.jdbc;

import java.sql.*;
public class AddCloumnEmployee {

	public static void main(String[] args) throws Exception {
		// Step 1: Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		 // Step 2 Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
		
		 String q = "alter table employee add designation varchar(30)";
		
		 // Step 3 :Create  Statement 
		  Statement st = con.createStatement();
		    // Step 4: Execute a query 
		  st.executeUpdate(q);
		    System.out.println("Column added to table");
		    String updateQuery = "update employee set age = 40, designation='Manager' where firstname='john' ";
		    st.executeUpdate(updateQuery);
		 // Step 5: Process the result set
		    System.out.println("Data updated sucessfully...!!");
		  
		// Step 6 :  close Resource
		con.close();
	}

}
