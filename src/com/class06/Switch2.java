package com.class06;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * store gender inside using M or F
		 * based on gender we'll specify
		 * 		if M--> Male
		 * 		if F--> Female
		 * 		otherwise --> not sure
		 */
		char gender='A';
		String gen;
		switch(gender) {
			case 'M': gen="Male"; break;
			case 'F': gen="Female"; break;
			default:  gen="N/A"; break;
		}
		System.out.println(gen);
		
	}

}
