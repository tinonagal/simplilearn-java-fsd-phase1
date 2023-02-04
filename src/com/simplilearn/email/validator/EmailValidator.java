package com.simplilearn.email.validator;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class EmailValidator {

	public static void main(String[] args) {
		
		System.out.println("Please enter email address: ");
		
		Scanner emailInput = new Scanner(System.in);
		
		String inputEmail = emailInput.next();
		
		System.out.println("The email address entered is: " + inputEmail);
		
		List<String> emaillist = new ArrayList<>();
		emaillist.add("abc@gmail.com");
		emaillist.add("efg@yahoo.com");
		emaillist.add("hij@hotmail.com");
		emaillist.add("klm@outlook.com");
		
		System.out.println("Email List: " + emaillist);
		
		EmailValidator emailValidator = new EmailValidator();
		
		String emailValidationStatus = emailValidator.checkEmailValidity(inputEmail,emaillist);
		System.out.println(emailValidationStatus);
	}
	private String checkEmailValidity(String userEmail, List<String> validEmailList) {
		
		for(int index = 0; index < validEmailList.size(); index++) {
			if(validEmailList.get(index).equals(userEmail)){
				String status =  userEmail + " is valid";
				return status;
				
			}
		}
		String status = userEmail + " is not valid";
		return status;
		
	}

}
