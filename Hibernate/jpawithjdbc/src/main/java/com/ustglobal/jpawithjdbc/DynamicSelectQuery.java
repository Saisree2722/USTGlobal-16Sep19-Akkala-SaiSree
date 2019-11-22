package com.ustglobal.jpawithjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;

//import com.mysql.jdbc.Driver;

public class DynamicSelectQuery 
{
	public static void main(String[] args)
	{

		String url ="jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
		String sql = "select *from employee_info where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			//		 Step1:-  Load the Driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");

			
			//		 Step 2:- Get the Connection
			conn = DriverManager.getConnection(url);

			//		 Step 3:- Issue SQL Query
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1,id);

			rs = pstmt.executeQuery();

			//			Step 4:- Read the Result
			if(rs.next()) {
				int emp_id=rs.getInt("id");
				int salary = rs.getInt("salary");
				String name = rs.getString("name");
				String gender = rs.getString("gender");

				System.out.println("Id is "+emp_id);
				System.out.println("Salary is "+salary);
				System.out.println("Name is "+name);
				System.out.println("Gender is "+gender);
				System.out.println("*****************************");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//			Step 5:- Close all the JDBC Objects
			try {
				if(conn!=null) {
					conn.close();
				}if(pstmt!=null) {
					pstmt.close();
				}

			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}	
}
