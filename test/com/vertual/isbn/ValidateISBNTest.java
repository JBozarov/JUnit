package com.vertual.isbn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.virtual.isbn.ValidateISBN;

class ValidateISBNTest {

	@Test
	public void checkValidISBN() {
		ValidateISBN validator = new ValidateISBN(); 
		boolean result = validator.checkISBN(140449116); 	
		assertTrue(result); 	
	}
	
	@Test 
	public void checkAnInvalidISBN() {
		ValidateISBN validator = new ValidateISBN(); 
		boolean result = validator.checkISBN(140449117); 
		assertFalse(result); 
	}
	
	@Test
	public void checkUpperCase() {
		ValidateISBN validator = new ValidateISBN(); 
		boolean isUpperCase = validator.upperCaseMaker("ZACH"); 
		assertTrue(isUpperCase); 
	}
	
	@Test 
	public void checkNotUpperCase() {
		ValidateISBN validator = new ValidateISBN(); 
		boolean notUpperCase = validator.upperCaseMaker("ZACHaa"); 
		assertFalse(notUpperCase);
		notUpperCase = validator.upperCaseMaker("John"); 
		assertFalse(notUpperCase);
	}
	
	
	// Exception 
	@Test 
	public void nineDigitISBNAreNotAllowed() {
		ValidateISBN validator = new ValidateISBN(); 	
		assertThrows(NumberFormatException.class, () -> {
			boolean result = validator.checkISBNOne("123456789"); 
		}); 
	}
	
	@Test
	public void helloWorldNotAllowed() {
		ValidateISBN validator = new ValidateISBN(); 
		assertThrows(NumberFormatException.class, () -> {
			boolean result = validator.checkISBNOne("helloworld"); 
		}); 
	}
	

}




















