package com.lionbank.model;

public class User {
	
	private String userName;
	private String password;
	private Long accountNumber;
	private int userId;
	private boolean ifValid;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public boolean isIfValid() {
		return ifValid;
	}
	public void setIfValid(boolean ifValid) {
		this.ifValid = ifValid;
	}
	
	

}
