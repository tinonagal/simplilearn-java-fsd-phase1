package com.simplilearn.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		File f1 = new File("/home/tinonagalgmail/simplilearn-java-fsd-phase1/java-fsd-phase1/File1.txt");
		
		try {
			if(f1.createNewFile()) {
				System.out.println("The file created is: " + f1.getName());
			}
		} catch (IOException e) {
			
			System.out.println("Exception occurd in file creation");
		}
	}

}
