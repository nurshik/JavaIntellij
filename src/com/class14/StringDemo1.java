package com.class14;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Azizi";
		String name1=new String("Azizi");
		//String length
		System.out.println(name);
		System.out.println(name.length());
		//Convert to upper or lower case
		String var1="Hello";
		System.out.println(var1.toLowerCase());
		System.out.println(var1.toUpperCase());
		//Concatenation
		String firstName="Steven";
		String lastName=" Markez";
		String fullName=firstName.concat(lastName);
		System.out.println(fullName);
		//Checks is string is empty or not
		String name2="";
		System.out.println(name2.isEmpty());
		//trims spaces at the end and start
		String name3="  Adam ";
		System.out.println(name3);
		System.out.println(name3.trim());
		//Checks if string contains symbol/word
		String var="This is demo #";
		System.out.println(var.contains("#"));
		System.out.println(var.startsWith("This"));
		System.out.println(var.endsWith("#"));
		
	}

}
