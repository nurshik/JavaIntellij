package com.class08;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		String card=null;
		do {
		System.out.println("Would you like to apply for credit card?");
		card=data.nextLine();
		}while(!(card.equalsIgnoreCase("yes")));
		System.out.println("Thank you!");
	}

}
