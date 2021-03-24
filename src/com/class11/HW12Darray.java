package com.class11;

public class HW12Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num= {
						{1,2,8},
						{25,13,4},
						{9,17,32}
					};	
		int sum=0;
		for(int[] n1:num) {
			for(int n2:n1) {
				sum+=n2;
			}					
		}
		System.out.println(sum);
	}

}
