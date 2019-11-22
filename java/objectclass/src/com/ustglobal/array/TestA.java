package com.ustglobal.array;

public class TestA 
{
  public static void main(String[] args) 
  {
	  int[] nums = new int[5];
	  nums[0] = 10;
	  nums[1] = 20;
	  nums[2] = 30;
	  nums[3] = 40;
	  nums[4] = 50;
	  
      for(int i=0; i<nums.length ; i++)
      {
    	  System.out.println(nums[i]);
      }
      System.out.println("**********************************");
      for(int num : nums) 
      {
    	  System.out.println(num);
      }
      System.out.println("**********************************");
      char[] ch = {'a','b','c','d'};
      for(int i = 0;i<ch.length ;i++)
      {
    	  System.out.println(ch[i]);
      }
      System.out.println("**********************************");
      for(int c : ch)
      {
    	  System.out.println(c);
      }
      System.out.println("**********************************");
      boolean[] b = {true,false,true,false,true,true};
      for(boolean b1 : b)
      {
    	  System.out.println(b1);
      }
      
      System.out.println("**********************************");
      byte[] by = {1,2,3,4,5};
      for(int x = 0 ; x<by.length ;x++)
      {
    	  System.out.println(by[x]);
      }
      System.out.println("**********************************");
      double[] d = {34.56,34.23,64.68,12.45,35.85};
      for(int y=0;y<d.length ; y++)
      {
    	  System.out.println(d[y]);
      }
      System.out.println("*********************************");
      String[] names= {"Sai","Sri","Janu","Pranu","Suchi"};
      for(String name : names)
      {
    	  System.out.println(name);
      }
  }
}
