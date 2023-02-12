package com.simplilearn.emailvalidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailValidator {

	public static void main(String[] args) {
        System.out.println("Please enter your email address: ");
		
		Scanner emailInput = new Scanner(System.in);
		
		String inputEmail = emailInput.next();
		
		System.out.println("Email Address entered by the user: " + inputEmail);
		
		List<String> emailList = new ArrayList<>();
		emailList.add("abc@gmail.com");
		emailList.add("def@outlook.com");
		emailList.add("ghi@hotmail.com");
		emailList.add("jkl@yahoo.com");
		
		System.out.println();
		
		EmailValidator emailValidator = new EmailValidator();
		
		String emailValidationStatus = emailValidator.checkForValidEmailAddress(inputEmail, emailList);
		
		System.out.println(emailValidationStatus);
	}
	
	private String checkForValidEmailAddress(String userEmail, List<String> validEmailList) {
		
		for(int index = 0; index < validEmailList.size(); index++) {
		
			if(validEmailList.get(index).equals(userEmail)) {
				
				String status = userEmail + " is a valid email";
				return status;
			}
			
		}
		String status = userEmail + " is not a valid email";
		
		return status;
		
	}

}
