package com.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*We have to identify if number is small, medium, large, xlarge
		 * if number between 1-10 --> small
		 * 11-100--> medium
		 * 101-1000-->large
		 * 1001-100000-->xlarge
		 */
		
		int n1=100;
		if(n1>1&&n1<10) {
			System.out.println(n1+" is a small");
		} 	else if(n1>=11 && n1<=100) {
			System.out.println(n1+" is medium");
			} 	else if(n1>=101 && n1<=1000) {
				System.out.println(n1+" is large");
			  	}		else if(n1>=1001 && n1<=100000) {
						System.out.println(n1+" is xlarge");
					}
	}

}
