package com.class17;

public class Task1 {
	String name;
	Task1(){
		System.out.println("Constructor with no parameters");
	}
	Task1(String name){
		this.name=name;
		System.out.println("Constructor with parameters");
	}
}
