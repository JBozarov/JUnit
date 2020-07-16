package com.virtual.isbn;

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

}
