package jdbc1;
						//DtaBase MetaData ::
import java.sql.*;
public class Demo2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useSSL=false","root","root@2002");
			
			DatabaseMetaData dm  =con.getMetaData();
			
			// getDriverName() ->Return the name of the JDBC Driver
			System.out.println("Dirver -->"+dm.getDriverName());
			// getDriverVersion() ->Return the Version of the JDBC Driver
			System.out.println("Driver Version -->"+dm.getDriverVersion());
			// getUserName() ->Return the UserName Of the Database;
			System.out.println("User Name -->"+dm.getUserName());
			// getDatabaseProductName() ->Return the Product Name of the Database;
			System.out.println("Databse -->"+dm.getDatabaseProductName());
			// getDatabaseProductName() ->Return the Product Version Of the Database;
			System.out.println("Databses Version -->"+dm.getDatabaseProductVersion());
			
			// getTables() ->Return the Description Of Tables in Database;
			System.out.println("Table Details -->----------------");
			String tb[]= {"Table"};
			ResultSet rs = dm.getTables(null, null, "%", tb);
			
			while(rs.next())
			{
					System.out.println(rs.getString(3));
			}
			
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}

}
