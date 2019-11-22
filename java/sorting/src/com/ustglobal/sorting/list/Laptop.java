package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop>
{
  double price;
  int ram;
  String brand;
public Laptop(double price, int ram, String brand) {
	super();
	this.price = price;
	this.ram = ram;
	this.brand = brand;
}
 
//public int compareTo1(Laptop lp) 
//{
//	if(this.price > lp.price) {
//		return 1;
//	} 
//	else if(this.price<lp.price){
//	return -1;
//	}
//	else {
//		return 0;
//	}
//
//}

@Override
public int compareTo(Laptop l) {
   if(this.ram > l.ram) {
	   return 1;
   }else if(this.ram <l.ram)
   {
	   return -1;
   }
   else
   {
	   return 0;
   }
}
} 

