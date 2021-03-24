package com.class05;

import java.util.Scanner;

public class HeightTaskBetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		System.out.println("Please, enter your height in inches");
		int h=data.nextInt();
		String definition = null;
		if(h<=0) {
			definition="Invalid value";
		}	else if(h>0 && h<60) {
				definition="You're short";
			}	else if(h>=60 && h<72) {
					definition="You're medium";
				}	else if(h>=72) {
						definition="You're tall";
					}
		System.out.println(definition);
	}

}
