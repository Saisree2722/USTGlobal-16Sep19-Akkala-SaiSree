package com.ustglobal.lambdaexpressions;

public class TestMessage implements MessageInterface
{

	@Override
	public void greet(String message) 
	{
	  System.out.println("Hello");
	  System.out.println("Message");
	}

	public static void main(String[] args) 
	{
	  	TestMessage t1 = new TestMessage();
	  	String msg = t1.greet("message");
	  	System.out.println("Message is " +msg);
	  	
	}
}
