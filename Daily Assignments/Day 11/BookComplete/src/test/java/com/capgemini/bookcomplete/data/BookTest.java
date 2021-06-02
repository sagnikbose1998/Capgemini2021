/**
 * 
 */
package com.capgemini.bookcomplete.data;

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
class BookTest {
	
	static Book b;
	static Book b1;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		b = new Book(121, "Harry Potter", 1000.00);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		b = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		b1 = new Book();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		b1 = null;
	}

	/**
	 * Test method for {@link com.capgemini.bookcomplete.data.Book#Book(int, java.lang.String, double)}.
	 */
	@Test
	void testBook() {
		assertEquals(new Book(), b1);
	}

	/**
	 * Test method for {@link com.capgemini.bookcomplete.data.Book#getBid()}.
	 */
	@Test
	void testGetBid() {
		assertEquals(121, b.getBid());
	}

	/**
	 * Test method for {@link com.capgemini.bookcomplete.data.Book#getBname()}.
	 */
	@Test
	void testGetBname() {
		assertEquals("Harry Potter", b.getBname());
	}

	/**
	 * Test method for {@link com.capgemini.bookcomplete.data.Book#getPrice()}.
	 */
	@Test
	void testGetPrice() {
		assertEquals(1000.00, b.getPrice());
	}

}
