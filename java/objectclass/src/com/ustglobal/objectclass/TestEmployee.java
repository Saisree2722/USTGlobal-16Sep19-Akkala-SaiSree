package com.ustglobal.objectclass;

public class TestEmployee
{
  public static void main(String[] args) 
  {
	Employee e1 = new Employee(1,"Sai",10000.00);
	Employee e2 = new Employee(2,"Sri",20000.00);
	Employee e3 = new Employee(3,"Jai",15000.00);
	
	 System.out.println(e1.equals(e2));
	 System.out.println(e2.equals(e3));
	 System.out.println(e1.equals(e3));
	 
	 System.out.println(e1);
	 System.out.println(e2);
    System.out.println(e3);

  }
}
