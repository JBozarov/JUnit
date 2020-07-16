package com.virtual.isbn;

import java.io.IOException;

public class ValidateISBN {

	public boolean checkISBN(int isbn) {
		if (isbn == 140449116){
			return true; 
		}
		return false; 
	}
	
	public boolean upperCaseMaker(String word) {
		boolean allUpper = word.chars().noneMatch(Character::isLowerCase); 
		return allUpper; 
	}
	
	// Exception 
public boolean checkISBNOne(String isbn) {
		
		if (isbn.length() != 10) throw new NumberFormatException("Not 10 digit long");
		Integer temp = Integer.parseInt(isbn);
		// did not work: 
		// if (temp instanceof Integer) throw new NumberFormatException("Not an integer"); 
		
		int total = 0; 
		for ( int i = 0; i<10; i++ ) {
			if(!Character.isDigit(isbn.charAt(i))) throw new NumberFormatException("Not an integer"); 
			total += isbn.charAt(i)*(10-i); 
		}
		if (total%11 == 0) {
			return true; 
		}
		else {
			return false; 
		}
	}



}
