package com.app.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.app.service.MyService;

public class MyServiceTest {

	private static MyService myservice;
	
	@BeforeAll
	public static void setUpMyService() {
		myservice=new MyService();
	}
	
	@Test
	public void testIsEvenNumberForEvenValue() {
		boolean b=myservice.isEvenNumber(10);
		assertEquals(true, b);
		
	}
	
	@Test
	public void testIsEvenNumberForOddValue() {
		boolean b=myservice.isEvenNumber(11);
		assertEquals(false, b);
		
	}
	
	@Test
	public void testIsValidPanNumberForNull() {
		assertFalse(myservice.isValidPanNumer(null));
	}
	
	@Test
	public void testIsValidPanNumberForTrue() {
		assertTrue(myservice.isValidPanNumer("ABCDE1212A"));
	}
	
	@Test
	public void testIsValidPanNumberForFalsel() {
		assertFalse(myservice.isValidPanNumer("asdfa"));
	}
}
