/**
 * 
 */
package com.capgemini.cmapp.service;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author The Wonder Land
 *
 */
class ContactManagerTest {
	
	private ContactManager contManager;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Print before everything");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Print at the end of everything");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Print before each test");
		System.out.println("Instantiating Contact Manager");
		contManager = new ContactManager();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Print at the end of all tests");
		contManager = null;
	}

	/**
	 * Testing Contact Creation
	 */
	@Test
	@DisplayName("Should Create Contact")
	void shouldCreateContact() {
		contManager.addContact("KJ", "jk", "09876543217");
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1, contManager.getAllContacts().size());
	}

	/**
	 * Testing Exceptions
	 */
	@Test
	@DisplayName("Should not Create Contact when fName is null")
	void shouldThrowRunTimeException() {
		Assertions.assertThrows(RuntimeException.class, 
				() -> {
					contManager.addContact(null, "jk", "09876543217");});
	}
	
	@Test
	@DisplayName("Should not Create Contact when lName is null")
	void shouldThrowRunTimeExceptionLName() {
		Assertions.assertThrows(RuntimeException.class, 
				() -> {
					contManager.addContact("KJ", null, "09876543217");});
	}
	
	@Test
	@DisplayName("Should not Create Contact when PhoneNo is null")
	void shouldThrowRunTimeExceptionPhone() {
		Assertions.assertThrows(RuntimeException.class, 
				() -> {
					contManager.addContact("KJ", "jk", null);});
	}
	
	//Testing Phone Number Format
	@Test
	@DisplayName("Phone Number should start with 0")
	void phoneNumberFormat() {
		Assertions.assertThrows(RuntimeException.class, 
				() -> {
					contManager.addContact("KJ", "jk", "99876543217");});
	}
	
	/**
	 * Testing Multiple Contact Creation
	 */
	@Nested
	class RepeatedTests{
		
		@DisplayName("Should Create Contact")
		@RepeatedTest(value = 5, name = "Repeat Test"
				+ "{currentRepitition} of {"
				+ "totalRepitition}")
		void shouldCreateRepeatedly() {
			contManager.addContact("KJ", "jk", "09876543217");
			assertFalse(contManager.getAllContacts().isEmpty());
			assertEquals(1, contManager.getAllContacts().size());
		}
	}
	
	/*
	 * Testing Multiple Phone Numbers
	 */
	@Nested
	class ParameterizedTests{
		@DisplayName("Phone Number format should match")
		@ParameterizedTest
		@ValueSource(strings = {"09876543217", "09876543777",
				"09876543265"})
		public void testPhoneNoFormat(String phoneNumber) {
			contManager.addContact("KJ", "jk", phoneNumber);
			assertFalse(contManager.getAllContacts().isEmpty());
			assertEquals(1, contManager.getAllContacts().size());
		}
		
	}
	
	private static List<String> phoneNumberList(){
		return Arrays.asList("09876543217", "09876543777",
				"09876543265");
	}
	
	@DisplayName("Testing Phone Number Format Using Method Source")
	@ParameterizedTest
	@MethodSource("phoneNumberList")
	public void testPhoneNumberMethodSource(String phoneNumber) {
		contManager.addContact("KJ", "jk", phoneNumber);
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1, contManager.getAllContacts().size());
	}
	
	@Test
	@DisplayName("Disable Test")
	@Disabled
	public void disabledTest() {
		throw new RuntimeException("Disabled Test");
	}

}