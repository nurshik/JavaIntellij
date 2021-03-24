package com.class11;

public class HW4Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] country= {
				{"USA","Canada","Mexico"},
				{"Peru","Bolivia","Brazil","Colombia"},
				{"France","England","Germany","Spain","Chezchia"},
				{"China","Japan","Thailand","Cambodia","Laos","India"},
				{"Chad","Morocco","Egypt","SAR","Zimbabwe","Tanzania"}
				};
		int num=0;
		for(int i=0;i<country.length;i++) {
			for(int j=0;j<country[i].length;j++) {
				num++;
				System.out.print(country[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Total number of countries="+num);
	}

}
