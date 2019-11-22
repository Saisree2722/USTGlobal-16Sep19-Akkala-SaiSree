package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJDBCWithProperties
{
	public static void main(String[] args)  
	{
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			//			Step 1:- Loading the Driver
			//			Driver driver = new Driver();
			//			DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));

			//			Step 2:- Establish the Connection
			//			String url = "jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
			//			conn=DriverManager.getConnection(url);
			//			                         OR
			String url = prop.getProperty("url");
			conn=DriverManager.getConnection(url,prop);

			//		    Step 3:- Issue the SQL Query
			stmt = conn.createStatement();
			String sql = prop.getProperty("select-query");
			rs = stmt.executeQuery(sql);

			//			Step 4:- Read the Result
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int salary = rs.getInt("salary");
				String gender = rs.getString("gender");

				System.out.println("Id: "+id);
				System.out.println("Name: "+name);
				System.out.println("Salary: "+salary);
				System.out.println("Gender: "+gender);
				System.out.println("************************");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {

			//			Step 5:- Close the JDBC objects (or) costly resources
			try {
				if(conn!= null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}if(rs!=null){
					rs.close();
				}if(reader!=null)
				{
					reader.close();
				}
			}catch(Exception e ) {
				e.printStackTrace();
			}
		}
	}//end of main()
}//end of MyFirstJDBC
