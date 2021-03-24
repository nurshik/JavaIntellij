package com.class14;

public class CharAtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Elvis";
		System.out.println(name.charAt(4));
		for(int i=0;i<name.length();i++) {
			
			if (name.charAt(i)=='s') {
				System.out.println("s found");
			}
			
		}
		
		String conf="Gulshoda is a student";
		System.out.println(conf.indexOf('a'));
		System.out.println(conf.substring(9,11));
	}

}
