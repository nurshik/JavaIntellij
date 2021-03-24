package com.class06;

import java.util.Scanner;

public class HWGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		char grade='0';
		String exp;
		System.out.println("Please, enter your grade");
		grade=data.next().charAt(0);
		switch(grade) {
		case 'A': exp="Excellent"; break;
		case 'B': exp="Good"; break;
		case 'C': exp="Average"; break;
		case 'D': exp="Bad"; break;
		default: exp="Not acceptable";
		}
		System.out.println("Your grade is "+exp);
	}

}
