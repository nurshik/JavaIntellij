package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*we need to calculate final price after discount
		 * 1 check if there is a sale
		 * if no sale--> I'm not going for shopping
		 * if there is the sale--> we'll ask the item-->then we'll ask the price
		 * if price is less than $10-->apply 5% discount
		 * if price is $10-$100--> 10% discount
		 * if price is $100-$500--> 20% discount
		 * if price is more than $500 --> 30% discount
		 * 
		 */
		Scanner data=new Scanner(System.in);
		String sale=null;
		double price=0;
		double discount=0;
		String item= null;
		System.out.println("Is it a sale? Yes/No");
		sale=data.nextLine();
		if(sale.equalsIgnoreCase("Yes")) {
			System.out.println("What is on sale?");
			item=data.nextLine();
			System.out.println("What is the price?");
			price=data.nextDouble();
			if (price>0.00) {
					
				if(price<=10) {
					discount=5;
				}	else if(price>10 && price<=100) {
						discount=10;
					}	else if(price>100 && price<=500) {
							discount=20;
						}	else {
								discount=30;
							}
				System.out.println("I purchased "+item+" which was "+"$"+price+" with discount "
							+discount+"% for $"+(price*(1-discount*0.01)));
				
			} 	else {
					System.out.println("Invalid value");
				}
		}	else {
				System.out.println("Sorry, I'll come another day");
			}
		
		
	}

}
