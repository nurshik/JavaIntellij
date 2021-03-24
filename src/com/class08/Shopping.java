package com.class08;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		System.out.println("What are you interested in?");
		String item=data.nextLine();
		System.out.println("What is the price?");
		double price=data.nextDouble();
		System.out.println("May I get your payment for "+item+"?");
		double pay=data.nextDouble();
		double diff=0;
		while(pay!=price) {
			if(pay<price) {
				System.out.println("Please, give me $"+(price-pay)+" more");
				diff=data.nextDouble();
				pay+=diff;
			}else {
				System.out.println("Here's your change $"+(pay-price));
				break;
			}
		}
		System.out.println("Thank you for shopping with us!");
	}

}
