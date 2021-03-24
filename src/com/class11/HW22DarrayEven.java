package com.class11;

public class HW22DarrayEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num= {
				{5,62,18,77},
				{13,8,45,54},
				{3,33,50,16}
		};
		int even=0, odd=0;
		System.out.println("------Even numbers---------");
		for(int[] r:num) {
			for(int c:r) {
				if(c%2==0) {
					System.out.print(c+" ");
					even+=c;
				}else {
					odd+=c;
				}
			}				
		}
		System.out.println();
		System.out.println("-----Sum Odd & Sum Even---------");
		System.out.println("Sum even="+even);
		System.out.println("Sum odd="+odd);
	}

}
