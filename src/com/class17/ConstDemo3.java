package com.class17;

public class ConstDemo3 {
	String name;
	double salary;
	double bonus;
	int daysWork;
	double bonusPercentage;
	
	ConstDemo3(String name, double salary, int daysWork, double bonusPercentage){
		this.name=name;
		this.salary=salary;
		this.bonus=1000;
		this.daysWork=daysWork;
		this.bonusPercentage=bonusPercentage;
	}
	void printBonus() {
		if(daysWork>300) {
			bonus=1000;
		}	else {
			bonus=5000;
			}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstDemo3 ramobj=new ConstDemo3("Ram", 100000, 300, 100);
		ramobj.printBonus();
		System.out.println(ramobj.name);
		System.out.println(ramobj.salary);
		System.out.println(ramobj.bonus);
		System.out.println(ramobj.daysWork);
		System.out.println(ramobj.bonusPercentage);
		
	}

}
