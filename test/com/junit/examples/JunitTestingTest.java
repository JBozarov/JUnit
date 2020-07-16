package com.junit.examples;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTestingTest {
	
	JunitTesting junitTesting = new JunitTesting(); 

	// Testing square 
	@Test
	public void testSquare() {
		int sq = junitTesting.square(4); 
		assertTrue(sq==16); 
	}
	
	@Test
	public void testNotSquare() {
		int sq = junitTesting.square(3); 
		assertFalse(sq == 91); 
	}
	
	
	// Testing occurrence 
	@Test
	public void testOccurrenceTrue() {
		int numberOfOccurrence = junitTesting.countOccurrence("hello world and I love earch and america",  'a'); 
		assertTrue(numberOfOccurrence == 5); 
	}
	
	@Test
	public void testNotOccurrence() {
		int numberOfNotOccurrence = junitTesting.countOccurrence("megaladon", 'x'); 
		assertFalse(numberOfNotOccurrence==34); 
	}
}
