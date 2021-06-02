package com.capgemini.UserRegistration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RegisterUserTest {
	public static RegisterUser re;
	
	@BeforeAll
	public static void setUp() {
		re = new RegisterUser("Hello", "World", "1234567891", "username_admin", "password123");
	}

	@Test
	void testRegisterUser() {
		RegisterUser re = new RegisterUser("Hello", "World", "1234567891", "username_admin", "password123");
		assertNotNull(re);
		RegisterUser re1 = null;
		assertNull(re1);
	}

	@Test
	void testGetters() {
		assertEquals("Hello", re.getFirstName());
		assertEquals("World", re.getLastName());
		assertEquals("1234567891", re.getMobileNumber());
		assertEquals("username_admin", re.getUserName());
		assertEquals("password123", re.getPassword());
	}
	

	@Test
	void testValidateUserName() {
		assertSame("Username is accepted", re.validateUserName(re.getUserName()));
		assertNotSame("Username cannot be accepted", re.validateUserName(re.getUserName()));
	}

	@Test
	void testValidatePassword() {
		assertSame("Password is accepted", re.validatePassword(re.getPassword()));
		assertNotSame("Password cannot be accepted", re.validatePassword(re.getPassword()));
	}

	@Test
	public void testDisplayDetails() {
		assertEquals("The details are:\nFirst Name: Hello\nLast Name: World\nMobile Number: 1234567891\nUser Name: username_admin\nPassword: password123", re.displayDetails());
		assertNotEquals("", re.displayDetails());
	}

}
