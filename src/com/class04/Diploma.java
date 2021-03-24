package com.class04;

public class Diploma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean diploma=true;
		double gpa=3.0;
		
		if(diploma) {
			System.out.println("Congrats!");
			if(gpa>3.5){
				System.out.println("You're eligible for scholarship");
			}	else {
					System.out.println("You'd have to study harder");
				}
		}	else {
				System.out.println("You should get one!");
		}
	}

}
