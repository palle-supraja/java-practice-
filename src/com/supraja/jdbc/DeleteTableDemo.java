package com.supraja.jdbc;

import java.sql.*;
public class DeleteTableDemo {

	public static void main(String[] args) throws Exception {
		// Step 1: Load the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Step 2: Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","root");
		// Step 3: Create a statement
		Statement st = con.createStatement();
		  // Step 4: Execute a query
		 String delete = "drop table faculty";
		st.executeUpdate(delete);
		// Step 5: Process the result set
		System.out.println("table deleted sucessfully....!!!");
		  // Step 6: Close the resources
		con.close();		

	}

}
