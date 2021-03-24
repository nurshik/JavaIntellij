package com.class05;

import java.util.Scanner;

public class BirthMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month;
		String season=null;
		Scanner data=new Scanner(System.in);
		System.out.println("Enter your birth month");
		month=data.nextLine();
		if(month.equals("June") || month.equals("July") || month.equals("August")) {
			season="Summer";
		}	else if(month.equals("September") || month.equals("October") || month.equals("November")) {
				season="Autumn";
			}	else if(month.equals("December") || month.equals("January") || month.equals("February")) {
					season="Winter";
				}	else if(month.equals("March") || month.equals("April") || month.equals("May")) {
						season="Spring";
					}	else {
						System.out.println("Invalid value");
						}
				System.out.println("You were born in "+season);
	}

}
