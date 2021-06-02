package com.capgemini.bookcomplete.exceptions;

public class BookAlreadyFoundException extends Exception {

	/**
	 * 	Exception to handle if the book is already found
	 */
	private static final long serialVersionUID = 175816;
	public BookAlreadyFoundException(String message) {
		super(message);
	}

}
