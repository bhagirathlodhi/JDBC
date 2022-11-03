package emp.org;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable_Database {
	public static void main(String[] args) throws Exception  {
		Connection con = null;
		Statement st  = null;
		try
		{
		 con = CreateConnection.createConnection();
		 st =con.createStatement();
		boolean rs= st.execute("create table EMP(id int not null,Fname varchar(24) not null,Lname varchar(24) not null, Address varchar(70) not null,Phone_n bigint not null,Gmail varchar(50) not null,Salary DECIMAL(5,2) not null,Profile varchar(34) not null,DeptName varchar(67) not null,primary key(id))");
		 
		System.out.println(rs);
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
