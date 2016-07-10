package com.lionbank.exception;

public class LoginFailureException extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Please enter correct username and password!";
	}

}
