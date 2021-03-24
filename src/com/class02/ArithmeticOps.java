package com.class02;

public class ArithmeticOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=5;
		
				
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		System.out.println("Sum of "+num1+" and "+num2+" equals "+sum);
		System.out.println(sum+" "+sub+" "+mult+" "+div);		
		
		double n1=10.99;
		double n2=90.99;
		double sumOfDouble=n1+n2;
		double subOfDouble=n1-n2;
		double divOfDouble=n2/n1;
		
		System.out.println("The result of division doubles "+divOfDouble);
		
		int mod=10%3;
		
		System.out.println("Remainder is = "+mod);
		

	}

}
