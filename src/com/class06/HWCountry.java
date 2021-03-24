package com.class06;

import java.util.Scanner;

public class HWCountry {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				/*
				 * Capture lang from user
				 * based on country identify favorite lang
				 * 
				 */
				Scanner data=new Scanner(System.in);
				System.out.println("Enter the country");
				String country, lang=null;
				country=data.nextLine();
				switch(country) {
				case "Italy": lang="Italian"; break;
				case "USA": lang="English"; break;
				case "Japan": lang="Japanese"; break;
				case "Afghanistan": lang="Farsi"; break;
				case "Vietnam": lang="Vietnamese"; break;
				case "Poland": lang="Polish"; break;
				case "Kazakstan": lang="Kazah"; break;
				default: lang="Unknown"; break;
				}
				System.out.println("You speak "+lang);
			}

		

}
