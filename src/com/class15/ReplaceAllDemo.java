package com.class15;

public class ReplaceAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1="Syntax is best434234";
		System.out.println(var1.replaceAll("[0-9]",""));
		var1="AKDAKJDH980736237efjafkhaksf";
		System.out.println(var1.replaceAll("[a-zA-Z]", ""));
		var1="890789hdjkfhsjkKJHjhjVW%&%&*(*&#@#";
		System.out.println(var1.replaceAll("[^0-9]",""));
		
	}

}
