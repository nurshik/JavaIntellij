package com.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println("Hello");
			if(i==3) {
				continue;
			}
			System.out.println("I'm inside the loop");
		}
		/*
		 * You need to print all numbers from 1 to 10 except 5 & 6
		 */
		for(int i=1;i<=10;i++) {
			if(i==5 || i==6) {
				continue;
			}
			System.out.println(i+" ");
		}
	}

}
