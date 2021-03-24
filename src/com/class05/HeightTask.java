package com.class05;

import java.util.Scanner;

public class HeightTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		System.out.println("Please, enter your height in inches");
		int h=data.nextInt();
		if(h<=0) {
			System.out.println("Invalid value");
		}	else if(h>0 && h<60) {
				System.out.println("You're short");
			}	else if(h>=60 && h<72) {
					System.out.println("You're medium");
				}	else if(h>=72) {
						System.out.println("You're tall");
					}
	}

}
