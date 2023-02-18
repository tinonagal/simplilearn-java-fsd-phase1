package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		
		File f1 = new File("/home/tinonagalgmail/simplilearn-java-fsd-phase1/java-fsd-phase1/File1.txt");
		
		try {
			Scanner fileReader = new Scanner(f1);
			while(fileReader.hasNextLine()) {
				String data = fileReader.nextLine();
				System.out.println(data);
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("No file to read. Exception thrown:");
			e.printStackTrace();
		}
	}

}
