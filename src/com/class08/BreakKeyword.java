package com.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean rain=true;
		int temp=60;
		while(rain) {
			System.out.println("I'll stay at home");
			if(temp>75) {
				System.out.println("I'll walk under warm rain");
				break;
			}
			temp+=2;
			
		}
		for(int i=1;i<=3;i++) {
			System.out.println("Hello"); break;
		}
	}

}
