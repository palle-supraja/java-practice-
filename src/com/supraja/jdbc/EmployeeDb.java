package com.supraja.jdbc;

import java.sql.*;
public class EmployeeDb {
	
	public static void main(String args[]) throws Exception{
		
		// step 1: Load JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		  // Step 2: Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeDb", "root", "root");
		 
		// Step 3 : create statement 
		String s= "create table employee(EId int(20) primary key auto_increment, firstname varchar(50), lastname varchar(50), age int(10))";
		Statement st = con.createStatement();
		st.executeUpdate(s);
		System.out.println("Employee table created in database..!!");
		con.close();
		}

}
