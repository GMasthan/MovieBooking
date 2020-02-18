package com.cg.exception;

public class NameException extends Exception {

	public NameException(String message) {
		super(message);
	}

	public NameException(String message, Throwable cause) {
		super(message, cause);
	}
}
