package com.app;

import java.sql.*;
import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useSSL=false","root","root@2002");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the empuId :");
			int emp_id= sc.nextInt();
			
			CallableStatement cst =con.prepareCall("{call add_disp(?,?)}");
			
			 // 1st parameter -> IN
			cst.setInt(1, emp_id);
			
			// 2nd parameter -> OUT (VARCHAR)
			cst.registerOutParameter(2,Types.VARCHAR);
			
			cst.execute();
			System.out.println("Empname : "+cst.getString(2));
			
			con.close();	                 
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
