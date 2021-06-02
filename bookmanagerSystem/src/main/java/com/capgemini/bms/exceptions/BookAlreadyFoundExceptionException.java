package com.capgemini.bms.exceptions;

@SuppressWarnings("serial")
public class BookAlreadyFoundExceptionException extends Exception {

	public BookAlreadyFoundExceptionException(String msg) {
		super(msg);
	}

}
