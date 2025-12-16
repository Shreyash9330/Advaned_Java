package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College","root", "root@2002");
		
		String s = " create table Student (sid int, sname varchar(45));";
		
		Statement st = con.createStatement();
		  st.execute(s);	
		  con.close();
		  
		  

	}

}
