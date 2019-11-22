package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB 
{
  public static void main(String[] args) 
  {
	 LinkedList<Laptop> ll = new LinkedList<Laptop>();
	 Laptop lp1 = new Laptop(44000,4,"Dell");
	 Laptop lp2 = new Laptop(34000,16,"HP");
	 Laptop lp3 = new Laptop(55000,8,"dell");
	 Laptop lp4 = new Laptop(38000,4,"Lenovo");

	 ll.add(lp1);
	 ll.add(lp2);
	 ll.add(lp3);
	 ll.add(lp4);
	 ll.add(new Laptop(200000,2,"Acer"));
	 Collections.sort(ll);
	 displayLaptopDetails(ll);
  }

static void displayLaptopDetails(LinkedList<Laptop> l) 
{
   Iterator<Laptop> it = l.iterator();
   while(it.hasNext())
   {
	   Laptop lp = it.next();
	   System.out.println("Brand is "+lp.brand);
	   System.out.println("Price is "+lp.price);
	   System.out.println("Ram is "+lp.ram);
   }
}
}
