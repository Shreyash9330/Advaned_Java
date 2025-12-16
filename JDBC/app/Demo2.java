package com.app;


import java.util.Scanner;
import java.sql.*;
public class Demo2 {

	public static void main(String[] args) {
		
		try {
			// Register the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish the Connection
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useSSL=false","root", "root@2002");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Employee id ");
			int id =sc.nextInt();
			
			
			PreparedStatement pst =con.prepareStatement("select * from students where id=?");
			pst.setInt(1, id);
			
			ResultSet rs =pst.executeQuery();
			if(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			}
			else
			{
				System.out.println("Employee id is not exist");
			}
			rs.close();
			con.close();
		}
		catch(Exception ex)
		{
			
		}
		
	}

}
