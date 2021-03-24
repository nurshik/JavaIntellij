package com.class03;

public class IfElseIf {

	public static void main(String[] args) {
		double d1=10.30;
		double d2=15.30;
		
		if(d1>d2) {
			System.out.println("Double value "+d1+" is larger than "+d2);
		}	else if(d1==d2){
			System.out.println("Double value "+d1+" is equal to "+d2);
			}	else {
			System.out.println("Double value "+d1+" is smaller than "+d2);
			}
		
		int day=0;
		if (day==1) {
			System.out.println("Today is Monday");
		}	else if(day==2) {
				System.out.println("Today is Tuesday");
			}	else if(day==3) {
					System.out.println("Today is Wednesday");
				}	else if(day==4) {
						System.out.println("Today is Thursday");
					}	else if(day==5) {
							System.out.println("Today is Friday");
						}	else if(day==6) {
								System.out.println("Today is Saturday");
							}	else if (day==7){
									System.out.println("Today is Sunday");
								}	else {
										System.out.println("The day is invalid");
									}
		
		
	}

	

}
