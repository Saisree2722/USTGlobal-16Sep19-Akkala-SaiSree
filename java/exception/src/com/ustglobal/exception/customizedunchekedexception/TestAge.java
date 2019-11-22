package com.ustglobal.exception.customizedunchekedexception;

public class TestAge {
 public static void main(String[] args) 
 {
   System.out.println("Main Started");
   
   Validator v = new Validator();
   try{
	   v.verify(12);
   }catch(InvalidAgeException ie) {
	   ie.printStackTrace();
   }
    v.verify(13);
   System.out.println("Main Ended");
 }
}
