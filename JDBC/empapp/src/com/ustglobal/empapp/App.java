package com.ustglobal.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App 
{
	public static void main(String[] args) 
	{
		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search single employee data");
		
		Scanner sc= new Scanner(System.in);
		int ch = sc.nextInt();

		switch(ch){
		case 1:
//                EmployeeDAOImpl impl = new EmployeeDAOImpl();
//                List<EmployeeBean> result = impl.getAllEmployeeData();
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();
                
                for(EmployeeBean bean : result) {
                	System.out.println("Id: "+bean.getId());
                	System.out.println("Name: "+bean.getName());
                	System.out.println("Salary: "+bean.getSalary());
                	System.out.println("Gender: "+bean.getGender());

                }
                break;
		case 2:
		        break;
		case 3:
	            break;
		case 4:
			    break;
		case 5: 
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
//			EmployeeDAOImpl impl5 = new EmployeeDAOImpl();
			int id = sc.nextInt();
//			EmployeeBean bean = impl5.searchEmployeeData(id);
      		EmployeeBean bean = dao5.searchEmployeeData(id);

			if(bean!=null) {
				System.out.println("Id: "+bean.getId());
            	System.out.println("Name: "+bean.getName());
            	System.out.println("Salary: "+bean.getSalary());
            	System.out.println("Gender: "+bean.getGender());
			}else {
				System.out.println("No data Found");
			}
			break;
		}//End of Switch case
	}//End of main()
}//end of class
