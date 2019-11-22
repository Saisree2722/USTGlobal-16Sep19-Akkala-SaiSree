package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class InsertWithProperties 
{
	 public static void main(String[] args) 
	  {
		Connection conn = null;
	    PreparedStatement pstmt = null;
	    FileReader reader = null;
//		Statement stmt = null;
	   
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
//			Step 1:- Load the driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));
			
//			Step 2:- Get the connection
			String url = prop.getProperty("url");
			conn  = DriverManager.getConnection(url,prop);

//			Step 3:- Issue SQL Query
//			String sql = " insert into employee_info "
//	                           + "values(6,'Sai',15000,'F') ";
//			stmt = conn.createStatement();
//			int count = stmt.executeUpdate(sql);
//			                      OR
			
			String sql = prop.getProperty("insert-query");
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1,id);
			
			String name = args[1];
			pstmt.setString(2,name);
			
			String empsalary = args[2];
			int salary = Integer.parseInt(empsalary);
			pstmt.setInt(3,salary);
			
			String gender = args[3];
			pstmt.setString(4,gender);
			
			int count = pstmt.executeUpdate();
			
			
			
//			Step 4:- Read the result
			System.out.println(count + " Row(s) Inserted ");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
//			Step 5:- Close the JDBC objects
			try {
				if(conn!=null) {
					conn.close();
				}
//				if(stmt!=null) {
//					stmt.close();
//				}
				if(pstmt!=null) {
					pstmt.close();
				}if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	  }//end if main()
	}//End of class

