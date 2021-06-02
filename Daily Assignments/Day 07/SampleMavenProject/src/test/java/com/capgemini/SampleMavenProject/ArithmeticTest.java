package com.capgemini.SampleMavenProject;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ArithmeticTest {
	ArithmeticOperations at = new ArithmeticOperations();
	
	@Test
	public void AddTest() { assertEquals(11, at.add(5,6)); }
	@Test
	public void SubTest() { assertEquals(10, at.subs(15, 25)); }
	@Test
	public void MultiTest() { assertEquals(63, at.mult(7, 9)); }
	@Test
	public void DivTest() { assertEquals(8, at.div(72, 9)); }
	

}
