package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class MyFrame{
	
	
	
}



public class Main {
	 static public Connection getConnection(){
		 
		 try {
			Class .forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Connection connect = null;
		 try {
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/log","root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connect;
		 
	 }
}
