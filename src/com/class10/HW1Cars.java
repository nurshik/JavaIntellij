package com.class10;

public class HW1Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars= {"BMW","Toyota", "Ford", "Kia", "Chevy", "Fiat"};
		for(int i=0;i<6;i++) {
			System.out.println(cars[i]);
		}
		System.out.println("----------second loop----------");
		for(String j:cars) {
			System.out.println(j);
		}
	}

}
