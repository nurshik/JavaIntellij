package com.class07;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0, odd=0;
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		System.out.println("Even="+even);
		System.out.println("Odd="+odd);
	}

}
