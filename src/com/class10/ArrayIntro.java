package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =10;
		 num=20;
		 System.out.println(num);
		 int[ ]array=new int[5];
		 array[0]=10;
		 array[1]=12;
		 array[2]=15;
		 array[3]=9;
		 array[4]=13;
		 System.out.println(array[0]+array[4]);
		 
		 
		 //Arrays are fixed inside
		 String[ ]names=new String[3];
		 names[0]="J";
		 names[1]="Jas";
		 names[2]="Jeff";
		 //names[3]="Sarah";//arrayindexoutbox
		 System.out.println(names[2]);
		 boolean[] b=new boolean[3];
		 b[0]=true;
		 b[1]=true;
		 b[2]=false;
		 System.out.println(b[2]);
		 
		 int size=b.length;
		 System.out.println("Size of an array is "+size);
	}

}
