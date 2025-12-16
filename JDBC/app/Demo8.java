package com.app;

import java.sql.*;
import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useSSL=false","root","root@2002");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the two number a & b :");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			CallableStatement cst =con.prepareCall("{?= call addTwoNumbers(?,?)}");
			
			cst.registerOutParameter(1,Types.INTEGER);
			cst.setInt(2, a);
			cst.setInt(3, b);
			
			cst.execute();
			System.out.println("Addition = "+cst.getInt(1));
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
