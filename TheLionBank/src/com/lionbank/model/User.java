package com.lionbank.model;

public class User {

	private String userName;
	private String password;
	private Long accountNumber;
	private int userId;
	private boolean ifValid = false;

	private String emailId;
	private int age;
	private Long phoneNumber;

	public User() {
	}

	public User(String userName, String password, Long accountNumber, String emailId, int age, Long phoneNumber) {
		super();
		this.userName = userName;
		this.password = password;
		this.accountNumber = accountNumber;
		this.emailId = emailId;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

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
