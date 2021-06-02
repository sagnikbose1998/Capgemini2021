package com.capgemini.bookcomplete.exceptions;

public class BookNameCannotBeNull extends Exception {
	/**
	 * 	Exception to handle if book name is null
	 */
	private static final long serialVersionUID = 101010;

	public BookNameCannotBeNull(String message) {
		super(message);
	}
}
