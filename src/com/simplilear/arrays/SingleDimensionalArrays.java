package com.simplilear.arrays;

public class SingleDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int integerArray[] = new int[5];
		
		integerArray[0] = 10;
		integerArray[1] = 20;
		integerArray[2] = 30;
		integerArray[3] = 40;
		integerArray[4] = 50;
		
		System.out.println("The length of the Array is: " + integerArray.length);
		
		//print Array using a loop statement
		
		for(int i = 0; i < integerArray.length; i++) {
			System.out.println(integerArray[i]);
		}
		
		
		//String Array example
		String stringArray[] = new String[3];
		
		stringArray[0] ="Sam";
		stringArray[1] = "John";
		stringArray[2] = "Don";
		
		for(int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}

	}

}
