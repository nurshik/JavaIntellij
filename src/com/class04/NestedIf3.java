package com.class04;

public class NestedIf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=18;
		int weight=1500;
		if(age>=18) {
			if(weight>110) {
				System.out.println("Let's get it done!");
			}	else {
					System.out.println("Sorry, you're too lightweight for it");
				}
		}	else {
				System.out.println("Sorry, 18+");
			}
	}

}
