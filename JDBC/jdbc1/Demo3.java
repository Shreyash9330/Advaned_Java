package jdbc1;

import java.sql.*;
import java.util.*;
public class Demo3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useSSL=false","root","root@2002");
			
			con.setAutoCommit(false);
			Scanner sc =new Scanner(System.in);
			
			System.out.println("Enter Empid Name & Salary");
			int emp_id =sc.nextInt();
			String name =sc.next();
			Float salary = sc.nextFloat();
			
			PreparedStatement pst = con.prepareStatement(" insert into employee values (?,?,?)");
			pst.setInt(1,emp_id);
			pst.setString(2, name);
			pst.setFloat(3, salary);
			
			pst.executeUpdate();
			System.out.println("Do you Want to save the Changes (Yes/No):");
			String ch = sc.next();
			
			if(ch.equals("Yes"))
			{
				System.out.println("Transaction Commited");
			}
			else
			{
				System.out.println("Transcation Calcled");
			}
			
			con.close();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
