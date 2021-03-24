package com.class06;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Capture food from user
		 * based on country identify favorite food
		 * 
		 */
		Scanner data=new Scanner(System.in);
		System.out.println("Enter the country");
		String country, food=null;
		country=data.nextLine();
		switch(country) {
		case "Italy": food="Pasta"; break;
		case "USA": food="Burger"; break;
		case "Japan": food="Sushi"; break;
		case "Afghanistan": food="Kabob"; break;
		case "Vietnam": food="Pho"; break;
		case "Poland": food="Pirogi"; break;
		case "Kazakstan": food="Kumys"; break;
		default: food="Unknown"; break;
		}
		System.out.println(country+" favorite food is "+food);
	}

}
