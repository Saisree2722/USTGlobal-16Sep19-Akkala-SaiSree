package com.ustglobal.jpawithjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery 
{
   public static void main(String[] args) 
   {
	
	Connection conn = null;  
	Statement stmt = null;
	try {
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
		Class.forName("com.mysql.jdbc.Driver");

		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
		conn = DriverManager.getConnection(url);
		
		String sql = "update employee_info set name='Sai',salary=15000,gender='F' where id=30";
		stmt = conn.createStatement();
		int count = stmt.executeUpdate(sql);
		
		System.out.println(count+" Row(s) Updated");
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(conn!=null) {
				conn.close();
			}
			if(stmt!=null) {
				stmt.close();
			}
		}catch(SQLException e ) {
			e.printStackTrace();
		}
	}
}
}
