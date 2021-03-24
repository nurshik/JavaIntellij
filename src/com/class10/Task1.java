package com.class10;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create array of grades A,B,C,D,E,f
		 */
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		System.out.println(grade[1]);
		
		System.out.println("------Another way------");
		char[] grade2= {'A','B','C','D','E','F','G'};
		System.out.println(grade2[6]);
		System.out.println("Number of elements in 2 array="+grade2.length);
	}

}
