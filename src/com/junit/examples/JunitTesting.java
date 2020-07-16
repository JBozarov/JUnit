package com.junit.examples;

public class JunitTesting {

	
	// square method 
	public int square (int x) {
		return x*x; 
	}
	
	
}
//occurrence 
	public int countOccurrence(String word, char c) {
		int count = 0; 
		for ( int i = 0; i<word.length(); i++ ) {
			if (word.charAt(i) == c) {
				count++; 
			}
		}
		return count; 
	}