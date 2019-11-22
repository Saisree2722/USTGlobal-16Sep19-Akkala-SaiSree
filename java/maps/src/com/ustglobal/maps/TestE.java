package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE 
{
	public static void main(String[] args) 
	{

		TreeMap<String, Integer> lh = new TreeMap<String, Integer>();
		lh.put("patna", 880000);
		lh.put("Banglore", 560076);
		lh.put("Punganur", 517247);
		//	  	lh.put(null, 9876534);  NullPointerException

	   for(Map.Entry<String , Integer> m : lh.entrySet())
	   {
		   String key = m.getKey();
		   Integer value = m.getValue();
		   System.out.println("Key is "+key);
		   System.out.println("Value is "+value);
		   System.out.println("============================");
		   
	   }
	} 
}
