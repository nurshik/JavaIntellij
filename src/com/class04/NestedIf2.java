package com.class04;

public class NestedIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean morning=false;
		boolean classToday=false;
		
		if(morning) {
			System.out.println("I'm going to work");
		}	else {
			System.out.println("Do I have a class");
				if (classToday) {
					System.out.println("I'm going to study");
				} 	else {
					System.out.println("I can relax");
					}
			}
	}

}
