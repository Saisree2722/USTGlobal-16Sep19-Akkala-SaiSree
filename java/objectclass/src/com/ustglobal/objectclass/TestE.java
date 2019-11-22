package com.ustglobal.objectclass;

public class TestE 
{
  public static void main(String[] args) 
  {
	Car c = new Car(500000,"Audi","Black");
	int h = c.hashCode();
	System.out.println(h);
	System.out.println(c);
	
	Car c1 = new Car(600000,"BMW","Grey");
	int h1 = c1.hashCode();
	System.out.println(h1);
	System.out.println(c1);
	
	Car c2 = new Car(200000,"Toyato","Blue");
	int h2 = c.hashCode();
	System.out.println(h2);
	System.out.println(c2);
  }
}
