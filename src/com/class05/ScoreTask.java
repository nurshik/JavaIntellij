package com.class05;

import java.util.Scanner;

public class ScoreTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quiz, mid, fin;
		double avg;
		char c = 0;
		Scanner data=new Scanner(System.in);
		System.out.println("Enter your quiz score");
		quiz=data.nextInt();
		System.out.println("Enter your midterm score");
		mid=data.nextInt();
		System.out.println("Enter your final score");
		fin=data.nextInt();
		avg=(quiz+mid+fin)/3;
		if(avg>=90) {
			c='A';
		} 	else if(avg<90 && avg>=70) {
			c='B';
			}	else if(avg<70 && avg>=50) {
					c='C';
				}	else if(avg<50) {
						c='F';
					}	else {
							System.out.println("Invalid value");
						}
		System.out.println("Your grade="+c);
		if(c=='A' || c=='B') {
			System.out.println("Good Job!");
		}
	}

}
