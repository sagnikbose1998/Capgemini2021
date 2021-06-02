package com.capgemini.bookcomplete.exceptions;

public class BookNotFoundException extends Exception {

	/**
	 * 	Exception to handle if book is not found while searching
	 */
	private static final long serialVersionUID = 715796;
	public BookNotFoundException(String message) {
		super(message);
	}
	
}
