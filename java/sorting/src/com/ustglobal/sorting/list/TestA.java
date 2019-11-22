package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class TestA 
{
  public static void main(String[] args) 
  {
	 ArrayList<Student> al = new ArrayList<Student>();
	 
	 Student s1 = new Student(3,"Mani" ,56.5);
	 Student s2 = new Student(2,"vani" ,34.5);
	 Student s3 = new Student(4,"rani" ,43.5);
	 Student s4 = new Student(1,"Pavani" ,76.6);

	 al.add(s1);
	 al.add(s2);
	 al.add(s3);
	 al.add(s4);
	 System.out.println("Before Sorting-----------");
	 displayStudentDetails(al);
	 Collections.sort(al);
	 System.out.println("After Sorting------------");
	 displayStudentDetails(al); 
  }
  
  static void displayStudentDetails(ArrayList<Student> al)
  {
	  Iterator<Student> it = al.iterator();
	  while(it.hasNext())
	  {
		  Student s = it.next();
		  System.out.println("ID is "+s.id);
		  System.out.println("Name is "+s.name);
		  System.out.println("Percentage is "+s.percentage);
		  System.out.println("---------------------------------");
	  }
  }
}
