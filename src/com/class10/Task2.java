package com.class10;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names=new String[4];
		names[0]="Lera";
		names[1]="Mirage";
		names[2]="Genni";
		names[3]="Karina";
		System.out.println(names[2]);
		
		String[] names2= {"Lera","Mirage","Genni","Karina"};
		System.out.println(names2[0]);
		
		String[] arr= {"Java","Saturday","day","coding","is"};
		System.out.println(arr[1]+" "+arr[4]+" "+arr[0]+" "+arr[3]+" "+arr[2]);
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	}

}
