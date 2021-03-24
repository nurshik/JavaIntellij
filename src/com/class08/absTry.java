package com.class08;

public class absTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<15;i++) {
			if(i==7 ||i==8) {				
				continue;
			}
			for(int j=1;j<=Math.abs(7-i);j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
