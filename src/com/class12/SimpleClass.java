package com.class12;

public class SimpleClass {
	String var1;
	int var2;
	
	public void method1() {
		System.out.println("Value of var1="+var1);
	}
	
	public String returnVar1() {
		return var1;
	}
	public void method2(String name) {
		var1=name;
	}
}
