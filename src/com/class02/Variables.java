package com.class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fName, lName, grade, city, state, phone;
		fName=("Albert");
		lName=("Einstein");
		grade=("B");
		city=("NYC");
		state=("NY");
		phone=("123456");
		System.out.println("My name is "+fName+" "+lName);
		System.out.println("I am a "+grade+" student");
		System.out.println("I live in "+city+", "+state);
		System.out.println("My phone number is "+phone);
		
		grade=("A");
		city=("Nome");
		state=("AK");
		phone=("654321");
		System.out.println("My name is "+fName+" "+lName+" and I moved to new city "+city+" and new state "+state);
		System.out.println("My new phone number is "+phone);
	}

}
