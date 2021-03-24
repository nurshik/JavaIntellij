package com.class04;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/* You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		*If loan is less or equal to 200,000 then you would lend the money,
		*otherwise you would reject the client.
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Hello, what amount do you need?");
		int amount=scan.nextInt();
		if(amount<=200000) {
			System.out.println("Congrats! Your loan is approved!");
		}	else {
				System.out.println("I'm sorry, we have to reject your application");
			}
		System.out.println("-------------------");
		/*You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver license to them, 
		 * otherwise you will offer them to get a learners permit.
		 */
		System.out.println("Hello, how old are you?");
		int age=scan.nextInt();
		if(age>=18) {
			System.out.println("Congrats, I'll issue you your DL!");
		}	else {
				System.out.println("I can offer you learners permit");
			}
		
		System.out.println("-------------------");
		/*Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print 
		 * “The temperature is the city __ is __”
		 */
		Scanner scan1=new Scanner(System.in);
		System.out.println("Please, enter your city");
		String city=scan1.nextLine();
		System.out.println("Please, enter the temperature in F");
		int temp=(scan1.nextInt()-32)*5/9;
		System.out.println("The temperature in the city "+city+" is "+temp+"C");
	}

}
