package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmployee
{
  public static void main(String[] args) 
  {
	 Employee e1 = new Employee(3,"Pranu",40000);
	 Employee e2 = new Employee(6,"janu",25000);
	 Employee e3 = new Employee(9,"dinu",24000);
	 Employee e4 = new Employee(8,"chandu",40000);
	 Employee e5 = new Employee(2,"mahesh",66000);
	 Employee e6 = new Employee(5,"navya",63000);
	 Employee e7 = new Employee(1,"sarath",32400);
	 Employee e8 = new Employee(7,"suchi",242320);
	 Employee e9 = new Employee(4,"Pooji",65000);

	  
	  ArrayList<Employee> al  = new ArrayList<>();
	  al.add(e1);
	  al.add(e2);
	  al.add(e3);
	  
	  ArrayList<Employee> al1  = new ArrayList<>();
	  al1.add(e4);
	  al1.add(e5);
	  al1.add(e6);
	  
	  ArrayList<Employee> al2  = new ArrayList<>();
	  al2.add(e7);
	  al2.add(e8);
	  al2.add(e9);
	  
	  HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
	  hm.put("first", al);
	  hm.put("second", al1);
	  hm.put("third", al2);
	  
	  ArrayList<Employee> first = hm.get("first");
	  Iterator<Employee> it = first.iterator();
	  while(it.hasNext())
	  {
		  Employee e = it.next();
		  System.out.println("Id is "+e.id);
		  System.out.println("Name is "+e.name);
		  System.out.println("Salary is "+e.salary);
		  System.out.println("===============================");

	  }
  }
}
