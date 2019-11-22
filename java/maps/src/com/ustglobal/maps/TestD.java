package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD 
{
  public static void main(String[] args) 
  {
	 
    LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
  	lh.put("Banglore", 560076);
  	lh.put("Punganur", 517247);
  	lh.put("patna", 880000);
  	
  	for(Map.Entry<String, Integer> m : lh.entrySet()) {
  		String key = m.getKey();
  		Integer value = m.getValue();
  		System.out.println("Kay is "+key+"----"+"value"+value );
  	}
  }
}
