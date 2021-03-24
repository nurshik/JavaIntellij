package com.class05;

import java.util.Scanner;

public class AnotherExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double comm = 0, sales;
		Scanner data=new Scanner(System.in);
		System.out.println("Please, enter your sales");
		sales=data.nextDouble();
		
		if (sales<10) {
			comm=0;
		}	else if(sales>=10 && sales<=100) {
				comm=sales*0.1;
			}	else if(sales>=101 && sales<=500) {
					comm=sales*0.2;
				} else if (sales>=501 && sales<=1000) {
						comm=sales*0.3;
					} 	else if(sales>1000) {
							comm=sales*0.5;
						}
		System.out.println("Your commission is $"+comm);
		if (comm>500) {
			System.out.println("You're amazing seller!");
		}
	}

}
