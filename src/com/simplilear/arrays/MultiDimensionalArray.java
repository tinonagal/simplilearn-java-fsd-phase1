package com.simplilear.arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int multiArray[][] = new int[3][3];
		
		//Row 1
		multiArray[0][0] = 10;
		multiArray[0][1] = 20;
		multiArray[0][2] = 30;
		//Row 2
		multiArray[1][0] = 40;
		multiArray[1][1] = 50;
		multiArray[1][2] = 60;
		//Row 3
		multiArray[2][0] = 70;
		multiArray[2][1] = 80;
		multiArray[2][2] = 90;
			
		for (int i = 0; i < 3; i++) {
			for (int j = 0;j < 3; j++) {
				System.out.print(multiArray[i][j] + " ");

			}
			System.out.println();
		}
	
	}

}
