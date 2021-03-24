package com.class07;

public class Evens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=20;i>=1;i-=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("------------");
		for(int i=20; i>=1; i--) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("------------");
		for(int i=20+1;i<=50;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("------------");
		for(int i=20;i<=50;i++) {
			if(i%2==1) {
			System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("------------");
		int sum=0;
		for(int i=1;i<=5;i++) {
			sum=sum+i;
		}
		System.out.println("Sum="+sum);
		/*int var=20;
		while(var<=20) {
			if(var%2==0) {
				System.out.print(var+" ");
				var--;
			}
		}*/
	}

}
