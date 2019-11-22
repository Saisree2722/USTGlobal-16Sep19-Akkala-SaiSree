package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD
{
 public static void main(String[] args) 
 {
  LinkedHashSet<Double> ls = new LinkedHashSet();
  ls.add(35.45);
  ls.add(76.45);
  ls.add(2.5);
  ls.add(4.55);
  ls.add(null);
  
  System.out.println("Using For Each");
  for(Double s : ls)
  {
	  System.out.println(s);
  }
  
  System.out.println("Using Iterator");
  Iterator<Double> it = ls.iterator();
  while(it.hasNext())
  {
	  Object s=it.next();
     System.out.println(s);
  }
 }
}
