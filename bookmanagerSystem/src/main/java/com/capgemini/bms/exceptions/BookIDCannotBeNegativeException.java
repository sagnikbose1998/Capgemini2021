package com.capgemini.bms.exceptions;

@SuppressWarnings("serial")
public class BookIDCannotBeNegativeException extends Exception {

	public BookIDCannotBeNegativeException(String msg) {
		super(msg);
	}

}
