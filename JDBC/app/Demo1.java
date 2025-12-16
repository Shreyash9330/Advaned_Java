package com.app;

import java.sql.*;

public class Demo1 {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useSSL=false", "root","root@2002");
			System.out.println("Connection established...");
			
			Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from students");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
		}
			
		rs.close();
		con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
