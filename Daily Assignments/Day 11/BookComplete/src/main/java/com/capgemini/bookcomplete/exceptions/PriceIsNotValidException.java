package com.capgemini.bookcomplete.exceptions;

public class PriceIsNotValidException extends Exception {
	/**
	 * 	Exception to handle if price is less than or equal to 0
	 */
	private static final long serialVersionUID = 121212;

	public PriceIsNotValidException(String message) {
		super(message);
	}
}
