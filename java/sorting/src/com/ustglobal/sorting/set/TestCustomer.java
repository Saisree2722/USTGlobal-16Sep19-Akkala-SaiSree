package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestCustomer 
{
	public static void main(String[] args) {
		
	SortByName1 sn  = new SortByName1();
	TreeSet<Customer> ts = new TreeSet<>(sn);
	Customer c1= new Customer("Sai",23,20000);
	Customer c2= new Customer("Suchi",45,30000);
	Customer c3= new Customer("Chandu",25,10000);
	Customer c4= new Customer("Bannu",21,24000);

	ts.add(c1);
	ts.add(c2);
	ts.add(c3);
	ts.add(c4);
	
	 System.out.println("*******************Using iterator**************");
		Iterator<Customer> it = ts.iterator();
		 while(it.hasNext())
		 {
			 Customer c=it.next();
	         System.out.println("Name is  "+c.name);
	         System.out.println("ID is  "+c.id);
	         System.out.println("Salary is  "+c.salary);
	         System.out.println("=================");

		 }
	}
}
