package com.ustglobal.maps;

import java.util.Hashtable;

public class TestG 
{
  public static void main(String[] args) 
  {
	 Hashtable<Integer , String > ht = new Hashtable<Integer , String >();
	 ht.put(507,"pranu");
	 ht.put(101,"ajay");
	 ht.put(102,"vijay");
	 ht.put(100,"sonu");
	 ht.put(99,"monu");
	 ht.put(500,"chanu");

	 ht.put(101, "Sriram");
//	 ht.put(null,"john");        NullPointerException
//	 ht.put(234,null);        NullPointerException
	 
	 System.out.println("Data "+ht);
  }
}
