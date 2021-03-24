package com.class14;

import java.util.Scanner;

public class Task1Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		String usernameTrue="Admin";
		String passwordTrue="password123";
		System.out.println("Enter the Username and Password");
		String username=data.nextLine();
		String password=data.nextLine();
		
		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("Username or Password cannot be empty");
		} else if(password.length()<8) {
				System.out.println("password cannot be shorter than 8 symbols");
			}	else if(password.contains(username)) {
					System.out.println("Password cannot contain the username");
				} else if (!password.equals(passwordTrue)) {
						System.out.println("Passwords do not match");
					}	else {
							System.out.println("Your username and password has been created");
						}
	}

}
