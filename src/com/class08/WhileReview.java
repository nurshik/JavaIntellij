package com.class08;

import java.util.Scanner;

public class WhileReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		System.out.println("Please, pay for your soda");
				
		double pay=data.nextDouble();
		while(pay!=3) {
		
			if(pay<3) {
				System.out.println("Please, give me more");
			}else {
				System.out.println("Please, give me less");
			}
			pay=data.nextDouble();
		}
		 System.out.println("Thank you");
			
		
	}

}
