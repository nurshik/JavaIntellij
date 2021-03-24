package com.class13;

public class MethodExample {
	String print() {
		return "Hi";
	}
	double doubleValue(double input) {
		return input*2;
	}
	void rain(boolean b) {
		if (b) {
			System.out.println("Take an umbrella");
		}else {
			System.out.println("Go for a walk");
		}
	}
	void batch() {
		for(int i=0;i<5;i++) {
			System.out.println("Batch 9");
		}
	}
	int great(int x, int y) {
		if(x>y) {
			return x;
		}else {
			return y;
		}
	}
	void evenOdd(int num) {
		if(num!=0) {
		if(num%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
		}
	}
	int sum(int[] arr1) {
		int sum1=0;
		for(int i=0;i<arr1.length;i++) {
			
			sum1+=arr1[i];
			
		}
		return sum1;
	}
	boolean mirror(String str) {
		String newStr="";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(i+" "+str.charAt(i));
			newStr+=str.charAt(i);
			
		}
		if(newStr.equals(str)) {
			return true;
		}else {
			return false;
		}
		
		
	}
	/*boolean pali(char[] arr) {
		char[] rev=new char[arr.length];
		for(int i=0;i<arr.length;i++) {
			rev[arr.length-1-i]=arr[i];
		}
		String revstring=rev.charAt();
	}*/
}
