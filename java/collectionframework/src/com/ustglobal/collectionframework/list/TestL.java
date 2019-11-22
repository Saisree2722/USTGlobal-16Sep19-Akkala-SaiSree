package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL 
{
  public static void main(String[] args) 
  {
	LinkedList<Integer> l = new LinkedList<>();
	l.add(12);
	l.add(13);
	l.add(56);
	l.add(5);
	l.add(10);
	
	System.out.println("Before Sort " + l);
	Collections.sort(l);
	System.out.println("After sort "  + l);
	
	Collections.reverse(l);
	System.out.println("After reverse "+ l);
	
	Collections.shuffle(l);
	System.out.println("After Shuffle "+ l);
  }
}
