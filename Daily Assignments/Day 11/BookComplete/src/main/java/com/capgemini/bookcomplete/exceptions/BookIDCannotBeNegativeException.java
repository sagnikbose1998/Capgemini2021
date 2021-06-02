package com.capgemini.bookcomplete.exceptions;

public class BookIDCannotBeNegativeException extends Exception {
	/**
	 *	Exception to handle if Book id is negative 
	 */
	private static final long serialVersionUID = 131313;

	public BookIDCannotBeNegativeException(String message) {
		super(message);
	}
}
