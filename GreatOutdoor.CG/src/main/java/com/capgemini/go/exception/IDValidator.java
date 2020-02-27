package com.capgemini.go.exception;

import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class IDValidator {

	public static boolean validateID(String retId) {
		Pattern pttrn=Pattern.compile("^[a-zA-Z]{2}[0-9]{2}");
		Matcher matcher=pttrn.matcher(retId);
		return matcher.matches();
		
	}

}
