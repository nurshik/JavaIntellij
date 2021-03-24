package com.class11;

public class NestedForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num= {
				{10,20,30,40},
				{90,80},
				{1,2,3,4,5,6,7}
				};
		for(int row=0;row<num.length;row++) {
			for(int col=0;col<num[row].length;col++) {
				System.out.print(num[row][col]+" ");
			}
			System.out.println();		
		}
		System.out.println("----------------");
		for(int[] n:num) {
			for(int s:n) {
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}

}
