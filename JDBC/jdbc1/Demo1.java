package jdbc1;
							//	ResultSetMetaData Interface;												
import java.sql.*;

public class Demo1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useSSL=false","root","root@2002");
			
			Statement st =con.createStatement();
			ResultSet rs = st.executeQuery("select * from employee");
			ResultSetMetaData rsmd =rs.getMetaData();
			
			
			// getColumnCount -> it  returns the no of column in the table;
			
			int cmt =rsmd.getColumnCount();  
			System.out.println("Total no of Column in table :"+cmt);
			
			
			// getColumnName -> it  returns the Name of column ;
			
			// getColumnTypeName -> it  returns the DataType of column ;

			for(int i=1;i<=cmt;i++)
			{
				System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));
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
