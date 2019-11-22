package com.ustglobal.jpawithjdbc;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicInsertQuery 
{
  public static void main(String[] args) 
  {
	Connection conn = null;
    PreparedStatement pstmt = null;
//	Statement stmt = null;
   
	try {
//		Step 1:- Load the driver
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
		Class.forName("com.mysql.jdbc.Driver");

		
//		Step 2:- Get the connection
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
		conn  = DriverManager.getConnection(url);

//		Step 3:- Issue SQL Query
//		String sql = " insert into employee_info "
//                           + "values(6,'Sai',15000,'F') ";
//		stmt = conn.createStatement();
//		int count = stmt.executeUpdate(sql);
//		                      OR
		
		String sql = " insert into employee_info values(?,?,?,?)";
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
		
		
		
//		Step 4:- Read the result
		System.out.println(count + " Row(s) Inserted ");
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
//		Step 5:- Close the JDBC objects
		try {
			if(conn!=null) {
				conn.close();
			}
//			if(stmt!=null) {
//				stmt.close();
//			}
			if(pstmt!=null) {
				pstmt.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
  }//end if main()
}//End of class
