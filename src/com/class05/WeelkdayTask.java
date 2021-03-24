package com.class05;

import java.util.Scanner;

public class WeelkdayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		System.out.println("Please, enter day of the week number");
		int day=data.nextInt();
		if(day>7) {
			System.out.println("Invalid value");
		}	else if(day>=1 && day<=5) {
				System.out.println("It's a weekday");
			} 	else if(day==6 || day==7) {
					System.out.println("It's weekend");
				}

		}

}
