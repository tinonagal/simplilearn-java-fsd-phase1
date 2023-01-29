package com.simplilearn.typecasting;

import java.util.Scanner;

public class ExplicitTypeCastingExample {

	public static void main(String[] args) {
		//2. Explicit or Narrowing
		// double > float > long > int > short >byte
		System.out.println("======================");
		System.out.println("=Explicit Type Casting");
		System.out.println("======================");
		
		System.out.println("Please enter any number:: ");
		
		Scanner doubleInput = new Scanner(System.in);
		
		double doubleValue = doubleInput.nextDouble();
		
		System.out.println("Value in Double::" + doubleValue);
		
		float floatValue = (float)doubleValue;
		long longValue = (long)doubleValue;
		int intValue = (int)doubleValue; 
		short shortValue = (short)doubleValue;
		byte byteValue = (byte)doubleValue;
		
		System.out.println("Value in Float::" + floatValue + " and the data type is: " + ((Object)floatValue).getClass().getSimpleName());
		System.out.println("Value in Long::" + longValue + " and the data type is: " + ((Object)longValue).getClass().getSimpleName());
		System.out.println("Value in Int::" + intValue+ " and the data type is: " + ((Object)intValue).getClass().getSimpleName());
		System.out.println("Value in Short::" + shortValue + " and the data type is: " + ((Object)shortValue).getClass().getSimpleName());
		System.out.println("Value in Byte::" + byteValue + " and the data type is: " + ((Object)byteValue).getClass().getSimpleName());
		
		
		
		
	}

}
