package com.class12;

public class Account {
	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	
	public void login(String passedUserName, String passedPassword) {
		if(userName.equals(passedUserName) && password.equals(passedPassword)) {
			System.out.println("Welcome to Bank, your balance is "+balance);
		}else {
			System.out.println("Username or password os not correct");
		}
	}
	public void printInfo() {
		if(isLoggedIn) {
			System.out.println("Your account number is "+accountNumber+" Your balance is "+balance);
		}
	}
	
	public void printUserAndPass(String passedUserName, String passedPassword) {
		System.out.println("Username="+passedUserName+" Password="+passedPassword);
	}
}
