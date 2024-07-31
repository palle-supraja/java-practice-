package com.supraja.jdbc;

import java.sql.*;


public class EmployeeDataInsert {

	public static void main(String[] args) throws Exception {
		
		// Step 1 : Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		// Step 2 : Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeDb", "root", "root");
		
		    String s = "insert into employee value(101, 'john', 'Doe', 30)";
		   
		// Step 3 : Create Statement
		Statement st = con.createStatement();
		
		
		// Step 4: Execute a query

		st.executeUpdate(s);

		// Step 5: Process the result set
		
		System.out.println("Row inserted into table..!!");
		//Step 5: Closing the resource
		
		con.close();

	}

}
