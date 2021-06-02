package com.capgemini.Sample_Maven_Project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArithmeticTest {

	Arithmetic ap= new Arithmetic();
	
	@Test
	public void addTest() {
		assertEquals(11,ap.add(5, 6));
		//assertEquals(expected output, actual Result) and returns boolean
	}
	
	@Test
	public void subTest() {
		assertEquals(10,ap.sub(20,10));
	}
	
	@Test
	public void mulTest() {
		assertEquals(10,ap.mul(5,2));
	}
	
	@Test
	public void divTest() {
		assertEquals(10,ap.div(200,20));
	}
}
