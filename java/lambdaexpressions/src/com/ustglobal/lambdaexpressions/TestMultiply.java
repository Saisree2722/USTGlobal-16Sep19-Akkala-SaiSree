package com.ustglobal.lambdaexpressions;

public class TestMultiply
{
 public static void main(String[] args)
 {
  MultiplyInterface multi = (a,b)->a*b;
  int product = multi.multiply(10, 20);
  System.out.println("Product is " + product);
 }
}
