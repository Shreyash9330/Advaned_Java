package com.app;

import java.util.Scanner;
import java.sql.*;
public class Demo4 {

	public static void main(String[] args) {
		
		try {
			
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useSSL=false","root","root@2002");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter empid,name & salary");
				int emp_id = sc.nextInt();
				String name = sc.next();
				float salary = sc.nextFloat();
				
				PreparedStatement pst = con.prepareStatement("update Employee set name=?,salary=? where emp_id=?");
				pst.setString(1, name);
				pst.setFloat(2, salary);
				pst.setInt(3,emp_id);
				
				
				int rows = pst.executeUpdate();
				
				if(rows>0)
				{
					System.out.println("Updated......");
				}
				else
				{
					System.out.println("Sorry ...empid  is not present");
				}
				
				con.close();
				
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
