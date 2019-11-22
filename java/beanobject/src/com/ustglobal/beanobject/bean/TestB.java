package com.ustglobal.beanobject.bean;
import java.util.Scanner;

public class TestB 
{
 public static void main(String[] args) 
 {
  System.out.println("Scanner Class");
  Scanner sc =12
		  new Scanner(System.in);
  System.out.println("Enter age");
  int age = sc.nextInt();
  System.out.println("Age is "+age);
  
  System.out.println("Are you female?");
  boolean a = sc.nextBoolean();
  System.out.println(a);
  
  System.out.println("Enter Name");
  String name = sc.next();
  System.out.println("Name is "+name);
  
  System.out.println("Enter Banch");
  String branch = sc.nextLine();
  System.out.println("Branch is "+branch);
  
 	 
 }
}
