package com.class02;

public class ArithmeticVsConcatenation {

	public static void main(String[] args) {
	int n1,n2;
	n1=10;
	n2=11;
	
	String str1=("Hello");
	String str2=("Hi");
	
	System.out.println(n1+n2+str1+str2);
	System.out.println(n1+str1+n2+str2);
	System.out.println(str1+str2+n1+n2);
	System.out.println(str1+str2+(n1+n2));
	}

}
