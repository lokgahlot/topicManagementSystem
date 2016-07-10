package com.lionbank.exception;

public class RegistrationFailureException extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Unable to register you! Please try again after sometime.";
	}

}
