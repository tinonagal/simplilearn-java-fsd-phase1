package com.simplilearn.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class ModifyFile {

	public static void main(String[] args) {
		
//		String oldfile = "/home/tinonagalgmail/simplilearn-java-fsd-phase1/java-fsd-phase1/File1.txt";
//		
//		String newfile = "This is the new text written to txt file";
//		
		try {
			FileWriter fwrite = new FileWriter("/home/tinonagalgmail/simplilearn-java-fsd-phase1/java-fsd-phase1/File1.txt");
			fwrite.append("Modified data to txt file");
			fwrite.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
