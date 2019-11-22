package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;


public class TestEmployee
{
	 public static void main(String[] args) 
	  {
		  Predicate<Employee> p = s->{
			  if(s.salary >=35) {
				  return true;
			  }else {
				  return false;
			  }
		  };
		  
		 Employee e = new Employee(1,"anup",57890);
		 boolean b  =p.test(e);
		 System.out.println(b);
	  }  
}
