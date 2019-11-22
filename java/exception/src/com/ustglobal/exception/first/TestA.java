package com.ustglobal.exception.first;

public class TestA 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Started");
		int[] a = {10,20,30,40};

		System.out.println(a[1]);
		try {
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Index is not Present");
		}

		System.out.println("Main ended");
	}
}
