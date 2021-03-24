package com.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* We play the lottery and we have a winning number 17
		 * we need to keep asking the user to enter any number from 1 to 100 
		 * until winning number entered
		 */
		
	Scanner data=new Scanner(System.in);
	int var;
	int win=17;
	/*do {
		System.out.println("Please enter the number from 1 to 100");
		var=data.nextInt();
	}while(var!=win);
	*/
	System.out.println("Please enter the number from 1 to 100");
	var=data.nextInt();
	while(var!=win) {
		System.out.println("Please enter the number from 1 to 100");
		var=data.nextInt();
	}
	
	
		System.out.println("Congrats!");
	
	}

}
