package com.class05;

import java.util.Scanner;

public class Largest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3, res;
		res=0;
		Scanner data=new Scanner(System.in);
		System.out.println("Enter the numbers");
		n1=data.nextDouble();
		n2=data.nextDouble();
		n3=data.nextDouble();
		if(n1>n2) {
			if(n1>n3) {
				res=n1;
			}	else {
					res=n3;
				}
		}	else {
				if(n2>n3) {
					res=n2;
					
				}	else {
					res=n3;
					}
			}
		System.out.println("The largest number is "+res);
	}

}
