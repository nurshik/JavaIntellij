package com.class15;

public class SBTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb1=new StringBuilder("Student");
		System.out.println(sb1);
		int salary=100005;
		StringBuilder sb=new StringBuilder(String.valueOf(salary));//converts datatype to a string
		sb.reverse();
		salary=Integer.parseInt(sb.toString());
		System.out.println(salary);
		
	}

}
