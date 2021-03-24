package com.class05;

import java.util.Scanner;

public class LogicalOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Variable day
		 * 	if day is Tuesday or Wed --> Manual Class
		 *  if day is Mon or Fri --> no class
		 *  if day is Sat or Sun --> Java Class
		 *  if day is Thurs --> review class
		 */
		Scanner data=new Scanner(System.in);
		System.out.println("Please enter the day");
		String day=data.nextLine();
		if (day.equalsIgnoreCase("Mon") || day.equalsIgnoreCase("Fri") ) {
			System.out.println("No class");
		}	else if(day.equalsIgnoreCase("Tue") || day.equalsIgnoreCase("Wed")) {
				System.out.println("Manual class");
			}	else if(day.equalsIgnoreCase("Thurs")) {
					System.out.println("Review class");
				}	else if(day.equalsIgnoreCase("Sat") || day.equalsIgnoreCase("Sun")) {
						System.out.println("Java class");
					}	else {
							System.out.println("Invalid day");
						}
		
	}

}
