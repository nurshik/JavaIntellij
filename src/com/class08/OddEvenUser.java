package com.class08;

import java.util.Scanner;

public class OddEvenUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		System.out.println("Enter your numbers");
		int a=data.nextInt();
		int b=data.nextInt();
		int odd=0, even=0;
		for(int i=a; i<=b;i++) {
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		System.out.println("Even="+even);
		System.out.println("Odd="+odd);
	}

}
