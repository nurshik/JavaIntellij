package com.class04;

import java.util.Scanner;

public class HW21 {

	public static void main(String[] args) {
		/*Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
		 * otherwise he is not. Once user is eligible and salary is larger than 50000 than
		 *  bonus = 5000, otherwise bonus=3000.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("How may years have you been working with us?");
		int year=scan.nextInt();
		System.out.println("What was your annual salary?");
		int salary=scan.nextInt();
		if(year<5) {
			System.out.println("Sorry, you're not qualified for bonus.");
		}	else {
				if (salary>50000) {
					System.out.println("Congrats! Your bonus is 5000");
				} else {
					System.out.println("Congrats! Your bonus is 3000");
				  }
			}
	}

}
