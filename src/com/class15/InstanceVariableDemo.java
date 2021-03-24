package com.class15;

public class InstanceVariableDemo {
	
	int number=10;//instance variable
	void printNumber() {
		System.out.println(number);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariableDemo obj=new InstanceVariableDemo();
		System.out.println(obj.number);
	}

}
