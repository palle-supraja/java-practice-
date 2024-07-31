package com.supraja.jdbc;

import java.sql.*;
public class SelectTableDemo {

	public static void main(String[] args) throws Exception{
		
		//step 1 : load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 : establish the connection
	   Connection con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","root");
	    
	   // Step 3: Create a statement
        Statement st = con.createStatement();
       
        // Step 4: Execute a query 
        ResultSet rs = st.executeQuery("SELECT * FROM student");
        System.out.println("studentID\tfirstname\tlastname\tdob\tgender\temail\tphone");
         System.out.println("===================================================================================");
        
         // Step 5: Process the result set
        while (rs.next()) {
            System.out.println(rs.getInt("studentID") + "\t" +
                               rs.getString("firstname") + "\t" +
                               rs.getString("lastname") + "\t" +
                               rs.getString("DOB") + "\t" +
                               rs.getString("gender") + "\t" +
                               rs.getString("email") + "\t" +
                               rs.getInt("phone"));
        }
        
        // step 6 : close resource
        rs.close();
        st.close();
        con.close();
	}

}
