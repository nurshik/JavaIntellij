package com.class11;

public class HW7Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fib=new int[10];		
		
			for(int j=0;j<10;j++) {
				if(j<2) {
					fib[j]=j;
				}else {
				fib[j]=fib[j-1]+fib[j-2];
				}
				System.out.print(fib[j]+" ");
			}
			
	}

}
