package com.app;
import java.sql.*;
import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/college?useSSL=false","root","root@2002");
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the City");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
