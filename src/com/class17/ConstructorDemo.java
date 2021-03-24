package com.class17;

public class ConstructorDemo {
	ConstructorDemo(){
		System.out.println("Constructor called");
		
	}
	int returnNumber() {
		return 10;
	}
	
	public static void main(String[] args) {
		ConstructorDemo obj=new ConstructorDemo();
		int var1=obj.returnNumber();
	}
}
