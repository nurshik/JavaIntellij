package com.class13;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample testprint=new MethodExample();
		System.out.println(testprint.print());
		System.out.println(testprint.doubleValue(10));
		testprint.rain(true);
		testprint.batch();
		System.out.println(testprint.great(8, 9));
		testprint.evenOdd(6);
		int[] arr1={1,2,3,4,5};
		System.out.println(testprint.sum(arr1));
		testprint.mirror("bba");
		System.out.println(testprint.mirror("assa"));
	}

}
