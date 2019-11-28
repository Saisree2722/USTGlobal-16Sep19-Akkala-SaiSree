package com.usglobal.didemo.util;

import com.ustglobal.didemo.dao.impl.A;
import com.ustglobal.didemo.dao1.I;

public class Manager 
{
	A a = null;
	public I getI()
	{
		if(a==null) {
			a=new A();

		}
		return a;
	}
}
