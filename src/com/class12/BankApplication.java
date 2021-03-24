package com.class12;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account leraAccount=new Account();
		leraAccount.accountNumber="123";
		leraAccount.userName="Lera123";
		leraAccount.password="pass123";
		leraAccount.balance=1400;
		//leraAccount.login("Lera123", "pass123");
		leraAccount.printUserAndPass("Ahmed", "654");
	}

}
