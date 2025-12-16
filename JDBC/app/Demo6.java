package com.app;

import java.sql.*;
import java.util.Scanner;
public class Demo6 {

	public static void main(String[] args) {
		
		try
		{
			// Step 1: Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Step 2: Connect to MySQL
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useSSL=false","root","root@2002");
			
			// Step 3: Take Input from User 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the empid,  name and salary");
			
			int emp_id = sc.nextInt();
			String name =sc.next();
			float salary = sc.nextFloat();
		
			// Step 4: Call Stored Procedure
			CallableStatement cst =con.prepareCall("{call addEmployee(?,?,?)}");
			
			cst.setInt(1, emp_id);
			cst.setString(2, name);
			cst.setFloat(3, salary);
			
			cst.execute();
			System.out.println("Record inserted using stored procedure.");
			
			// Step 5: Close Connection 
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
	}

}
