package com.rameshsoft.automation.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExEmailValidation {
public static void main(String[] args) {
	
	String emailId = "haarsh21@gmail.com";
	
	Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
	
	Matcher matcher = pattern.matcher(emailId);
	
	if(matcher.find() && matcher.group().equalsIgnoreCase(emailId)) {
		System.out.println("valid email id");
	}
	else {
		System.out.println("email id is not valid");
	}
}
}
