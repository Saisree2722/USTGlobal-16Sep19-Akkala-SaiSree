package com.ustglobal.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO
{
	public ArrayList<EmployeeBean> getAllEmployeeData()
	{
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info";
		Connection conn = null;
		Statement stmt= null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			ArrayList<EmployeeBean> result = new ArrayList<EmployeeBean>();
			while(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				int id = rs.getInt("Id");
				bean.setId(id);
				String name = rs.getString("name");
				bean.setName(name);
				int salary = rs.getInt("salary");
				bean.setId(salary);
				String gender = rs.getString("gender");
				bean.setName(gender);

				result.add(bean);
				//				System.out.println("ID: "+rs.getInt("id"));
				//				System.out.println("Name: "+rs.getString("name"));
				//				System.out.println("Salary: "+rs.getInt("salary"));
				//				System.out.println("Gender: "+rs.getString("gender"));
				//				System.out.println("************************");
			}
			return result;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(stmt!=null) {
					stmt.close();
				}if(rs!=null) {
					rs.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}//End of try-catch-finally
	}//end of getAllEmployeeData

	public EmployeeBean searchEmployeeData(int id)
	{
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select *from employee_info where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
		    pstmt.setInt(1,id);
		    rs = pstmt.executeQuery();
		    if(rs.next()) {
		    	EmployeeBean bean = new EmployeeBean();
		    	bean.setId(rs.getInt("id"));
		    	bean.setName(rs.getString("name"));
		    	bean.setSalary(rs.getInt("salary"));
		    	bean.setGender(rs.getString("gender"));
		    	return bean;
		    }else {
		    	return null;
		    }
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(conn!=null)
				{
					conn.close();
				}if(pstmt!=null) {
					pstmt.close();
				}if(rs!=null) {
					rs.close();
				}
				}catch(Exception e){
					e.printStackTrace();

				}
		}
	}
		public int insertEmployeeData(EmployeeBean bean) {
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			String sql = "insert into  employee_info values(?,?,?,?)";
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				conn = DriverManager.getConnection(url);
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
				
//				Step 4:- Read the result
				System.out.println(count + " Row(s) Inserted ");    
			 
			}catch(Exception e) {
				e.printStackTrace();
				
			}finally {
				try {
					if(conn!=null)
					{
						conn.close();
					}if(pstmt!=null) {
						pstmt.close();
					}
					}catch(Exception e){
						e.printStackTrace();

					}
			}
			
		

	}//End of Method

}//End of Class App
