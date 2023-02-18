package com.simplilearn.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		 
		try {
			FileWriter fwriter = new FileWriter("/home/tinonagalgmail/simplilearn-java-fsd-phase1/java-fsd-phase1/File1.txt");
		
			fwriter.write("testing the write function");
			fwriter.close();
			System.out.println("The new sentence has been written to file.txt");
		} catch (IOException e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}

	}

}
