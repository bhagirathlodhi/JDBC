package emp.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class CreateConnection {
	static Connection con=null;
	public static Connection createConnection() throws Exception
	{
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","Lodhi@123");
		
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}

		return con;
	}
	public static void closeAllConnection(Connection con,PreparableStatement stmt,ResultSet rst ) throws SQLException
	{
		if(con!=null)
			con.close();
		
		if(stmt!=null)
			((Connection) stmt).close();
		if(rst!=null)
			rst.close();
	}
	public static void Massage()
	{
		System.out.println();
		System.out.println(" Have a another Query");
	}

}
