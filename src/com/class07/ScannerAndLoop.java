package com.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		String name=null;
		int n=1;
		while(n<=5) {
			System.out.println("What is your name?");
			name=data.nextLine();
			System.out.println("Hello "+name);
			n++;
		}
		
		
	}

}
