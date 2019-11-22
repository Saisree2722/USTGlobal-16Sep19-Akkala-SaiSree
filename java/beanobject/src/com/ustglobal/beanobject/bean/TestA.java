package com.ustglobal.beanobject.bean;

public class TestA 
{
  public static void main(String[] args) 
  {
	 Student s = new Student();
	 s.setId(12);
	 s.setName("Shivagami");
	 s.setRollNo(505);
	 
	 Database db = new Database();
	 db.receive(s);
	 
	 Employee e = new Employee();
	 e.setId(501);
	 e.setName("Sai");
	 e.setSalary(1200000);
	 db.save(e);
  }
}
