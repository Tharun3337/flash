package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;


public class DBConnectDemo {

	
	public static void main(String args[]) throws SQLException
	{
		//1.Register the driver class
		
		//DriverManager.registerDriver(new SQLDriver);
		//String jdbcURL="jdbc:mysql://localhost/mydb","root","kmit1234";
		String user="root";
		String password="kmit1234";
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","kmit1234");
		
		System.out.println(con);
		
		con.close();
	}
}
