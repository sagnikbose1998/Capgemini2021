package com.capgemini.bms.exceptions;

@SuppressWarnings("serial")
public class BookNameCannotBeNullException extends Exception {

	public BookNameCannotBeNullException(String msg) {
		super(msg);
	}

}
