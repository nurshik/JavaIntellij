package com.class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scan=new Scanner(System.in);
		/*System.out.println("Type any text");
		String text=scan.nextLine();
		System.out.println("We entered "+text);
		*/
		System.out.println("Please, enter your name");
		String name=scan.next();
		System.out.println("Nice to meet you "+name);
	}

}
