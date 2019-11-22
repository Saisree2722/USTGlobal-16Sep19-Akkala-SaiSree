package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
 public static void main(String[] args) {
	
	 TreeSet ts = new TreeSet();
	 ts.add(34);
	 ts.add(35);
	 ts.add(87);
	 ts.add(23);
	 ts.add(9);
//	 ts.add(null); //NullPointerException
//	 ts.add("Sai"); //ClassCastException
	 
	 System.out.println("*******Using for each********");
	 for(Object s : ts)
	 {
	 System.out.println(s);
	 }
	 System.out.println("*******Usinfg Iterator*********");
	 Iterator it = ts.iterator();
	 while(it.hasNext())
	 {
		 Object p =it.next();
		 System.out.println(p);
		 
	 }
}
}