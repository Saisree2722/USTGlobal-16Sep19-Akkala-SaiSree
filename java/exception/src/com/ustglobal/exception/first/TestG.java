package com.ustglobal.exception.first;

public class TestG 
{
 public static void main(String[] args)
 {
  System.out.println("Main Started");
  
  PayTM p = new PayTM();
  try {
  p.book();
  }catch(ArithmeticException ae) {
	  System.out.println("Exception Caught in Main");
  }
  finally {
	  System.out.println("Executed Finally");
  }
  System.out.println("Main Ended");
 }
}
