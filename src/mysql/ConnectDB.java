package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDB {
	
	static Connection connection = null;
	static String databaseName = "";
	static String url = "jdbc:mysql://localhost:3306" + databaseName;
	
	static String username = "root";
	static String password = "admin";

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection(url,username,password);
		PreparedStatement ps = connection.prepareStatement("INSERT INTO student.student (name) VALUES ('dat');");
		
		
		int status = ps.executeUpdate();
		
		if(status !=0) {
			System.out.println("Database was Connection");
		}
	}

}
