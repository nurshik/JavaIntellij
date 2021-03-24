package com.class11;

import java.util.Scanner;

public class HW6PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		System.out.println("In:");
		int n=data.nextInt();
		boolean prime=true;		
		/*
		if(n%2==0) {
			if(n/2==1) {
				prime=true;
			}else { 
				prime=false;			
			}
		} else {
			if(n/3==1) {
				prime=true;
			}else if(n/5==1){
				prime=true;			
			}else if(n/7==1) {
				prime=true;
			}else if(n/11==1) {
				prime=true;
			}else {
				prime=false;
			}		
	}
		if(prime) {
		System.out.println("Number is prime");
		}else {
			System.out.println("Number is complex");
		}*/
		System.out.println("--------------");
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
		}
		if(prime) {
			System.out.println("Number is prime");
			}else {
				System.out.println("Number is complex");
			}
}}
