package com.class04;

public class Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rate=5.0;
		int price=290000;
		
		if (rate>4.5) {
			System.out.println("I'm not buying the house");
		}	else {
				if(price>200000) {
					System.out.println("I'll have to take a loan");
				}	else {
						System.out.println("I'll pay cash");
					}
			}
	}

}
