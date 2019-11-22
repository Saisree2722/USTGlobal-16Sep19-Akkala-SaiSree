package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestK2 
{
	public static void main(String[] args) {
		
	Comparator<Employee1> comp = (e1,e2)->{
		if(e1.id > e2.id) {
			return 1;
		}else if(e1.id < e2.id)
		{
			return -1;
		}
		else {
			return 0;
		}
	};
	 
	 TreeSet<Employee1> ts = new TreeSet<>(comp);
	 Employee1 e1= new Employee1(5,"Dinesh",5.5);
	 Employee1 e2= new Employee1(3,"Jaikar",5.6);
	 Employee1 e3= new Employee1(6,"sarath",5.3);
	 Employee1 e4= new Employee1(2,"Mahesh",5.7);
	 
     ts.add(e1);
     ts.add(e2);
     ts.add(e3);
     ts.add(e4);
     
     System.out.println("*************Using iterator************");
     Iterator<Employee1> it = ts.iterator();
     while(it.hasNext())
     {
    	 Employee1 e =it.next();
    	 System.out.println("Name is "+e.name);
    	 System.out.println("ID is "+e.id);
    	 System.out.println("Height is "+e.height);
    	 System.out.println("==========================");

     }
}
}
