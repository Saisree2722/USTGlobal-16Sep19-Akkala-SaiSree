package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF 
{
 public static void main(String[] args) {
	 TreeSet<String> ts = new TreeSet();
	 ts.add("Sai");
	 ts.add("Janu");
	 ts.add("Pranu");
	 ts.add("Suchi");
	 ts.add("Navya");
	 //ts.add(null);  NullPointerException

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
