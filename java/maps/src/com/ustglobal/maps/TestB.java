package com.ustglobal.maps;

import java.util.HashMap;

public class TestB 
{
 public static void main(String[] args)
 {
	 HashMap hm = new HashMap();
	   hm.put("kuku", 998014);
	   hm.put("mala", 678943);
	   hm.put("sheela", 345432);
	   
     HashMap hm1 = new HashMap();
	   hm1.put("deepu", 987645);
	   hm1.put("riya", 723440 );
	   hm1.put("kriti", 123245);

     boolean hasKey = hm.containsKey("mala");
     System.out.println("Has Key--> "+ hasKey);
     System.out.println("=======================");
     
     boolean hasValue = hm.containsValue(345432);
     System.out.println("Has Value--> "+hasValue );
     System.out.println("=======================");
     
     hm.putAll(hm1);
     System.out.println("After put all "+hm);
     System.out.println("========================");
     
     System.out.println("Size of map "+hm.size());
     System.out.println("========================");
     
     Boolean isEmpty = hm.isEmpty();
     System.out.println("Map is Empty "+isEmpty);
     System.out.println("========================");
     
     hm.clear();
     System.out.println("After clear "+hm);
 }
}
