package com.class06;

import java.util.Scanner;

public class HWCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		double num1, num2, res;
		char op='0';
		System.out.println("Enter 2 numbers");
		num1=data.nextDouble();
		num2=data.nextDouble();
		System.out.println("Choose an operator");
		op=data.next().charAt(0);
		switch(op) {
		case '+': res=num1+num2; break;
		case '-': res=num1-num2; break;
		case '*': res=num1*num2; break;
		case '/': res=num1/num2; break;
		default: res=0; System.out.println("Invalid Operator"); break;
		}
		System.out.println("Result="+res);
	}

}
