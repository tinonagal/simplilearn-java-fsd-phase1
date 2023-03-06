package com.simplilearn.endproject1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EndProject1 {

	public static void main(String[] args) {

		System.out.print("Good day! Please choose your option: ");
		System.out.println("\n");
		selections();
	}
	
	private static void selections() {
		String[] arr = {"1. Show file directory list", 
				"2. Sort file directory list", 
				"3. Add afile to the directory", 
				"4. Delete a file from the directory", 
				"5. Search for a file in the directory",
				"6. Close the application"
		};		
		int[] choices1 = {1,2,3,4,5,6};
		int choicelen = choices1.length;
		for(int i=0; i<choicelen; i++) {
			System.out.println(arr[i]);
		}
		// create a file that is really a directory
	   File filesDir = new File("/home/tinonagalgmail/simplilearn-java-fsd-phase1/java-fsd-phase1/File Directory/");

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
				case 1: //show files working
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
				case 3: //add file working
					System.out.println("Enter the FileName you want to add in to the directory: \n");
					System.out.println("\n");
					String newfile = stringScanner.next();
					String filepath = new String("/home/tinonagalgmail/simplilearn-java-fsd-phase1/java-fsd-phase1/File Directory/");
					File file = new File(filepath + "" +newfile);
					try {
						file.createNewFile();
						System.out.println(newfile + " has been added to the directory");
					} catch (IOException e) {
						e.printStackTrace();
					}
					selections();
					break;
				case 4:
					System.out.println("Please enter the file you want to delete: \n");
					String delfile = stringScanner.next();
					String path = new String("/home/tinonagalgmail/simplilearn-java-fsd-phase1/java-fsd-phase1/File Directory/");
					try {
						Files.delete(Paths.get(path+""+delfile));
						System.out.println(delfile + " has been deleted \n");
					} catch (IOException e) {
						System.out.println("File not found, please try again \n");
						
					}

					selections();
					break;
					
				case 5://search file working
					System.out.println("Please enter the file to search: \n");
					String findfile = stringScanner.next();
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
					
					selections();
					break;
					
				case 6:
					System.exit(0);
					
			
				}
			}
		}
		
	}

}


