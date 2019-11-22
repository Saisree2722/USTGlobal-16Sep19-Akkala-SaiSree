package com.ustglobal.maps;

import java.util.HashMap;

public class TestA 
{
 public static void main(String[] args) 
 {
   HashMap hm = new HashMap();
   hm.put("kuku", 998014);
   hm.put("mala", 678943);
   hm.put("sheela", 345432);
   
   System.out.println("Data" + hm);
   hm.put("mala", 797654);
   System.out.println("After modify "+hm);
   hm.put("dimple",345432);
   System.out.println("After adding dimple "+hm);
   hm.put(null,345645);
   hm.put(null,876543);
   System.out.println("After adding two nulls " +hm);

   Object phoneno = hm.get("sheela");
   System.out.println("Value "+ phoneno);
   
   System.out.println("==================================");
   Object phoneno1 = hm.get("meena");
   System.out.println("Value "+ phoneno1);
   
   System.out.println("==================================");
   Object value = hm.remove("kuku");
   
   System.out.println("After remove---> " + hm);
 }
}