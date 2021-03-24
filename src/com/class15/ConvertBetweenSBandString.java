package com.class15;

public class ConvertBetweenSBandString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1="Nelson";
		StringBuilder sb1=new StringBuilder(var1);
		sb1.reverse();
		var1=sb1.toString();
		System.out.println(var1);
	}

}
