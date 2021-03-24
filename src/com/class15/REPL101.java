package com.class15;

import java.util.Scanner;

public class REPL101 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		//leave above alone!  write your code below
		for(int i=0;i<5;i++){
      arr[i]=input.nextLine();
      /*if(arr[i].length()<3){
        System.out.println("Name mut be at least 3 characrets long");
        continue;
      }*/

    }
    for(String c:arr){
      for(int j=0;j<3;j++) {
    	System.out.print(c.charAt(j));
      }
      System.out.println();
    }
	}
}
