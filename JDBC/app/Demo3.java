package com.app;

import java.util.*;
import java.sql.*;

public class Demo3 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useSSL=false", "root", "root@2002");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter dept id and dept name");
			int dept_id = sc.nextInt();
			String name = sc.next();
			
			PreparedStatement pst = con.prepareStatement("insert Employees(dept_id,name) into values(? ?)");
			pst.setInt(1,dept_id);
			pst.setString(2, name);
			pst.executeUpdate();
			System.out.println("Record Inserted");
			con.close();
			}
		catch(Exception ex)
		{
		
		}

	}

}
