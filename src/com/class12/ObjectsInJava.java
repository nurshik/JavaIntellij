package com.class12;



public class ObjectsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone iPhone=new MobilePhone();
		iPhone.model="iPhone 12";
		iPhone.price=1200;
		iPhone.size=6.4;
		iPhone.make="Apple";
		iPhone.color="Black";
		
		MobilePhone S21=new MobilePhone();
		S21.model="S21";
		S21.price=1100;
		S21.size=6.5;
		S21.make="Samsung";
		S21.color="Silver";
		S21.test();
	
	iPhone.pcolor();
}
}
