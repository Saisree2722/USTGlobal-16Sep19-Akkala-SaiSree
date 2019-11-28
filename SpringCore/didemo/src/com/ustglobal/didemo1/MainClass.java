package com.ustglobal.didemo1;

import com.usglobal.didemo.util.Manager;
import com.ustglobal.didemo.dao1.I;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Manager manager = new Manager();

		I i = manager.getI();
		i.m1();
		i.m2();
		i.m3();
	}
}
