package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI
{
 public static void main(String[] args)  
 {
	//SortByName sb = new SortByName();
	//SortByPinCode sp = new SortByPinCode();
	SortByMICR sm = new SortByMICR();

	TreeSet<Bank> ts = new TreeSet<>(sm);
	Bank b1 = new Bank("SBI",252417,8253434);
	Bank b2 = new Bank("HDFC",560068,5253454);
	Bank b3 = new Bank("CITI",560054,76543124);
	Bank b4 = new Bank("CANARA",560076,2345645);

	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);

    System.out.println("*******************Using iterator**************");
	Iterator<Bank> it = ts.iterator();
	 while(it.hasNext())
	 {
		 Bank b=it.next();
         System.out.println("Name is  "+b.name);
         System.out.println("Pincode is  "+b.pincode);
         System.out.println("MICR is  "+b.micr);
         System.out.println("=================");

	 }
 }
}
