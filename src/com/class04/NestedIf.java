package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean morning=true;
		boolean classtoday=true;
		
		if (morning) {
			if (classtoday) {
				System.out.println("Hello classmates!");
			} else {
				System.out.println("Hello family!");
			}
		}
		
		boolean allallergy=true;
		boolean pollen=true;
		
		if(allallergy) {
			System.out.println("Let's check which allergies you have");
			if(pollen) {
				System.out.println("Stay away from trees");
			}else	{
				System.out.println("You don't have any pollen allergy");
			}
			
		} else {
			System.out.println("You're lucky not having any allergies");
		}
		
		
		boolean fr=true;
		int day=12;
		if(fr) {
			System.out.println("I'm going to movies!");
			if(day==13) {
				System.out.println("I'm watching a scary movie");
			}	else {
					System.out.println("I'm watching a comedy");
			}
		}	else {
				System.out.println("I'm staying home");
		}
		
		boolean comp=true;
		int score=90;
		if(comp) {
			if (score>=90) {
				System.out.println("Great job!");
			}	else if(score>=80) {
				System.out.println("Good job");
				}	else if(score>=70) {
					System.out.println("Good, but can be better");
					}	else {
						System.out.println("You need to study more");
						}
		}	else {
			System.out.println("Complete all the tasks!");
			}
		
	}

}
