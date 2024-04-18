package Week13;

import java.sql.*;
public class TryConnect {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost";
		String user = "root";
		String pass = "";
		Connection con;
		Statement st;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connected");
			
			st = con.createStatement();
			st.execute("create database student1");
			System.out.println("Database connected");
		} catch (Exception e) {
		  System.out.println(e);
		}

	}

}