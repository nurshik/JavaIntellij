package com.class02;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1,num2,num3,sum,sub,mult,div,sq,per,area,w,h;
		num1=15.5;
		num2=20.8;
		num3=3.9;
		w=5;
		h=8;
		sum=num1+num2;
		sub=num2-num1;
		mult=num1*num2;
		div=num2/num1;
		
		sq=num3*num3;
		per=2*(w+h);
		area=w*h;
		
		System.out.println("The sum of 2 numbers "+num1+" and "+num2+" is equal to "+sum);
		System.out.println("The substraction of 2 numbers "+num2+" and "+num1+" is equal to "+sub);
		System.out.println("The multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+mult);
		System.out.println("The division of 2 numbers "+num2+" and "+num1+" is equal to "+div);
		System.out.println("The square of the "+num3+" is "+sq);
		System.out.println("The perimeter of a rectangle with width "+w+" and height "+h+" is equal to "+per+" and the area is "+ area);
	}

}
