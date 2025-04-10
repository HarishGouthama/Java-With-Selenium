package com.rameshsoft.automation.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPattern {
public static void main(String[] args) {
	
	Pattern pattern = Pattern.compile("x");
	Matcher matcher = pattern.matcher("a9c@z8#l");
	while(matcher.find()) {
		System.out.println(matcher.start() + "......." + matcher.group());
	}
}
}
