package com.simplilearn.lockers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class LockersProject {

	public static void main(String[] args) {
		System.out.print("Good day! Please choose your option: ");
		System.out.println("\n");
		selections();
	}
	
	private static void selections() {
		String[] arr = {"1. Show file directory list", 
				"2. Sort file directory list", 
				"3. File Operation", 
				"4. Close the application"};
		
		int[] choices1 = {1,2,3,4};
		int choicelen = choices1.length;
		for(int i=0; i<choicelen; i++) {
			System.out.println(arr[i]);
		}
		// create a file that is really a directory
	   File filesDir = new File("/home/tinonagalgmail/simplilearn-java-fsd-phase1/java-fsd-phase1/Lockers Directory/");

	    // get a listing of all files in the directory
	   String[] filelist = filesDir.list();
   
		System.out.println("Enter your choice:"
				+ "");
		Scanner sc = new Scanner(System.in);
		Scanner stringScanner = new Scanner(System.in);
		int choice = sc.nextInt();
		for(int j=0; j<choicelen; j++) {
			if(choice==j) {
				switch(choice) {
				case 1: //show files in directory
					System.out.println("The files in the directory are: \n");
					for ( int i=0; i<filelist.length; i++ )
					    {
					      System.out.println( filelist[i] );
					      }
					System.out.println("\n");
					selections();
					break;
				case 2: //sort files working
					Arrays.sort(filelist);
					System.out.println("The sorted files in the directory: \n");
					for ( int i=0; i<filelist.length; i++ )
					    {
					      System.out.println(filelist[i]);}
					System.out.println("\n");
					selections();
					break;
				case 3:
					
					System.out.println("\n");
					System.out.println("File Operation choices: \n");
					System.out.println("Choose the operation you want to perform");
					selection2();
				case 4:
					//System.out.println("Thank you. Exiting programme ");
					selections();
					}
			
				}
			}
		}

	private static void selection2() {
		String[] arr2 = {"1. Add a file to the directory", 
				"2. Delete a file from the directory", 
				"3. Search for a file in the directory", 
				"4. Back to main selections"};
		
		int[] choices2 = {1,2,3,4};
		int choicelen2 = choices2.length;
		for(int a=0; a<choicelen2; a++) {
			System.out.println(arr2[a]);	
		}
		File filesDir = new File("/home/tinonagalgmail/simplilearn-java-fsd-phase1/java-fsd-phase1/Lockers Directory/");

	    // get a listing of all files in the directory
	    String[] filelist = filesDir.list();
		Scanner sc2 = new Scanner(System.in);
		Scanner stringScanner2 = new Scanner(System.in);
		int choice2 = sc2.nextInt();
		for(int b=0; b<choicelen2; b++) {
			if(choice2==b) {
				switch(choice2) {
				case 1://add a file in to the directory
					System.out.println("Enter the FileName you want to add in to the directory: \n");
					System.out.println("\n");
					String newfile = stringScanner2.next();
					String filepath = new String("/home/tinonagalgmail/simplilearn-java-fsd-phase1/java-fsd-phase1/Lockers Directory/");
					File file = new File(filepath + "" +newfile);
					try {
						file.createNewFile();
						System.out.println(newfile + " has been added to the directory\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
					selection2();
					break;
				case 2://delete a file form the directory
					System.out.println("Please enter the file you want to delete: \n");
					String delfile = stringScanner2.next();
					String path = new String("/home/tinonagalgmail/simplilearn-java-fsd-phase1/java-fsd-phase1/Lockers Directory/");
					try {
						Files.delete(Paths.get(path+""+delfile));
						System.out.println(delfile + " has been deleted \n");
					} catch (IOException e) {
						System.out.println("File not found, please try again \n");
						
					}

					selection2();
					break;
				case 3://search for a file in the directory
					System.out.println("Please enter the file to search: \n");
					String findfile = stringScanner2.next();
					boolean test = false;
					for ( int i=0; i<filelist.length; i++ ){
						String filetest = filelist[i];
						if (filetest.equals(findfile)) {
						test = true;
						}						
					}
					if (test) {
						System.out.println("The file is present in the directory list \n");
					}
					else {
						System.out.println("File not found \n");
					}
					
					selection2();
					break;
				case 4://need to go back to first selections
					selections();
				}
			}
		}
	}
}

	
