/**
 * 
 */
package com.capgemini.cmapp.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Debanjan
 *
 */
class ContactTest {

	/**
	 * @throws java.lang.Exception
	 */
	static Contact cont;
	static Contact cont1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cont = new Contact("Rama", "Krishna", "0123456789");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		cont = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		cont1 = new Contact();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		cont1 = null;
	}

	/**
	 * Test method for {@link com.capgemini.cmapp.model.Contact#Contact()}.
	 */
	@Test
	void testContact() {
		assertEquals(new Contact(), cont1);
	}

	/**
	 * Test method for {@link com.capgemini.cmapp.model.Contact#getFname()}.
	 */
	@Test
	void testGetFname() {
		assertEquals("Rama", cont.getFname());
	}

	@Test
	void testGetLname() {
		assertEquals("Krishna", cont.getLname());
	}


	/**
	 * Test method for {@link com.capgemini.cmapp.model.Contact#getPhnNo()}.
	 */
	@Test
	void testGetPhnNo() {
		assertEquals("0123456789", cont.getPhnNo());
	}


}
