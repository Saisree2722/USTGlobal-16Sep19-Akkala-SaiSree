package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestPen
{
 public static void main(String[] args) 
 {
	ArrayList<Pen> al = new ArrayList<>();
   	Pen p1 = new Pen(10,"Reynolds");
   	Pen p2 = new Pen(15,"Parker");
   	Pen p3 = new Pen(20,"elkos");
   	Pen p4 = new Pen(5,"Cello");

   	al.add(p1);
    al.add(p2);
    al.add(p3);
    al.add(p4);
    
    System.out.println("Before Sorting-----------");
	 displayPenDetails(al);
	 Collections.sort(al);
	 System.out.println("After Sorting------------");
	 displayPenDetails(al); 
 }
 
 static void displayPenDetails(ArrayList<Pen> al)
 {
	  Iterator<Pen> it = al.iterator();
	  while(it.hasNext())
	  {
		  Pen p = it.next();
		  System.out.println("Price is "+p.price);
		  System.out.println("Brand is "+p.brand);
		  System.out.println("---------------------------------");
	  }
 }
}
