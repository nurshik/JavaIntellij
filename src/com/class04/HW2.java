package com.class04;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*Create a Java program that will ask if user has a credit card or not.
		 *  If you user does not have a credit card then offer them.
		 *  If they do have one ask what is balance on the card?
		 *  If balance of the card is larger than 1000, tell them to pay off immediately,
		 *  otherwise you can tell them that they can spend more.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Hello, do you have a credit card? Yes/No?");
		
		String card=scan.nextLine();
		String yes="Yes";
		if (card.equalsIgnoreCase("yes")) {
			System.out.println("Great! What is your balance?");
			int bal=scan.nextInt();
			if (bal>1000) {
				System.out.println("Please, pay it off immediately!");
			}	else {
					System.out.println("You good, you can spend more");
				}
		}	else {
			System.out.println("We have a great offer for you!");
			}
			
		
	}

}
