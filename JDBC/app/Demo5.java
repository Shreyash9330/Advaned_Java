package com.app;
import java.sql.*;
import java.util.Scanner;
public class Demo5 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useSSL=false","root","root@2002");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the empid");
			int emp_id = sc.nextInt();
			
			PreparedStatement pst = con.prepareStatement("delete from employee  where emp_id=?");
			pst.setInt(1, emp_id);
			
			int rows =pst.executeUpdate();
			
			if(rows>0)
			{
				System.out.println(rows+"Deleted Sucessfully.........");
			}
			else
			{
				System.out.println("Sorry......");
			}
			
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println();
		}

	}

}
