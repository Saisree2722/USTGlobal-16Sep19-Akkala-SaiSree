package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE 
{
  public static void main(String[] args) 
  {
	ArrayList<Marker> al = new ArrayList<>();
	al.add(new Marker(50,"red"));
	al.add(new Marker(70,"blue"));
	al.add(new Marker(80,"green"));
	al.add(new Marker(40,"Black"));
	
   System.out.println("Before Sorting");
   display(al);
   
   SortByPrice sb = new SortByPrice();
   SortByColor sc = new SortByColor();

   Collections.sort(al,sb);
   Collections.sort(al,sc);
  
   System.out.println("After Sorting ----------->");
   display(al);
  }

 static void display(ArrayList<Marker> al) 
 {
	 Iterator<Marker> it = al.iterator();
	  while(it.hasNext())
	  {
		  Marker m = it.next();
		  System.out.println("ID is "+m.color);
		  System.out.println("Name is "+m.price);
		  System.out.println("---------------------------------");
	  }
 }
  
}