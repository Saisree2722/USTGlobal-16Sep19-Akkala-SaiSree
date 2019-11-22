package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
	public static void main(String[] args) {
         
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
			
			// step 1 load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step 2 get the connection
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step 3 issue sql query
			String sql = "insert into employee_info values(7,'Hema',34000,'F')";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//step 4 read the result
			System.out.println(count +" Row(s) inserted ");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//step 5 close all jdbc objects
			try {
				if(conn!=null) {
					conn.close();
				}//if(stmt!=null) {
					//stmt.close();
				//}
					if(pstmt!=null) {
						pstmt.close();
					}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}//end of main()
}// end of ExecuteInsertQuery class
