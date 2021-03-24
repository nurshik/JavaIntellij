package com.class11;

public class Task2Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] grades= {{"John","Kelsey","Matt","Jeff"},
							{"A","D","C","B"}};
		for(int i=0;i<grades.length;i++) {
			for(int j=0;j<grades[i].length;j++) {
				if(grades[i][j].equals("A") || grades[i][j].equals("B")) {
					System.out.println(grades[i-1][j]+"'s grade is "+grades[i][j]);
				}
			}
		}
		
	}

}
