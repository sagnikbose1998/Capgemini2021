package com.capgemini.ContactManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactTest {
	public static Contact ct;
	
	@BeforeAll
	public static void setUp() { 
		System.out.println("This method is annoted with @BeforeAll to execute as first method in the test class ContactTest");
		ct = new Contact("Hello", "World", "9123456789");
	}
	
	@BeforeEach
	public void setUpForTest() {
		System.out.println("This method is annoted with @BeforeEach to execute ");
	}
	
//	Constructor testing
	
	@Test
	public void testContact() {
		Contact ct1 = new Contact("Hello", "World", "9123456789");
		assertNotNull(ct1);
		
		Contact ct2 = null;
		assertNull(ct2);
	}
	
//	Getters testing
	@Test
	public void testGetters() {
		assertEquals("Hello", ct.getFirstName());
		assertEquals("World", ct.getLastName());
		assertEquals("9123456789", ct.getMobileNunber());
	}
	
//	Methods testing
	@Test
	public void testValidateFirstName() {
		assertSame("First name is valid", ct.validateFirstName("Hello"));
		assertNotSame(null, ct.validateFirstName(ct.getFirstName()));
	}
	
	@Test
	public void testValidateLastName() {
		assertSame("Last name is valid", ct.validateLastName("World"));
		assertNotSame(null, ct.validateLastName(ct.getLastName()));
	}
	
	@Test
	public void testValidateMobileNumber() {
		assertSame("Mobile Number is valid", ct.validateMobileNumber("9123456789"));
		assertNotSame(null, ct.validateMobileNumber(ct.getMobileNunber()));
	}
	
	@Test
	public void testDisplayDetails() {
		assertEquals(new String ("The details of contact are: Hello World 9123456789\n"), ct.displayDetails());
		assertNotEquals(new String ("Not the person we thought to be"), ct.displayDetails());
	}
	
	@AfterEach
	public void stopThis() {
		System.out.println("This method is annoted with @AfterEach");
	}
	
	@AfterAll
	public static void stopAll() {
		System.out.println("This method is used in @AfterAll");
		ct = null;
	}
	
	
}
