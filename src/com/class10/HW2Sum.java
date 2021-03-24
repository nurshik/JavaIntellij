package com.class10;

public class HW2Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3, 20, 35, 47, 55, 69, 78};
		int sum=0;
		for(int i=0;i<7;i++) {
			sum+=nums[i];
		}
		System.out.println("Sum of "+nums[0]+"+"+nums[1]+"+"+nums[2]+"+"+
				nums[3]+"+"+nums[4]+"+"+nums[5]+"+"+nums[6]+"="+sum);
	}

}
