package com.class15;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1="Today is Monday";
		String[] strArr=var1.split(" ");
		for(String word:strArr) {
			System.out.println(word);
		}
		String var2="Good. Better. Best.";
		String[] strArr2=var2.split("[.]");
		for(int i=0;i<strArr2.length;i++) {
			System.out.println(strArr2[i]);
		}
		String var3="       Syntax        ";
		System.out.println(var3.trim().toLowerCase());
	}

}
