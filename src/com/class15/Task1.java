package com.class15;

public class Task1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.empID=1;
		e1.salary=10000;
		System.out.println("ID="+e1.empID+" salary is "+e1.salary+" and CEO is "+e1.CEO);
		
		Employee e2=new Employee();
		e2.empID=2;
		e2.salary=20000;
		System.out.println("ID="+e2.empID+" salary is "+e2.salary+" and CEO is "+e2.CEO);
		int total=0;
		Students s1=new Students();
		s1.studentName="Vasya";
		s1.studentID=001;
		total=s1.numberOfStudents+1;
		
		Students s2=new Students();
		s2.studentName="Petya";
		s2.studentID=002;
		total+=1;
			
		Students s3=new Students();
		s3.studentName="Kolya";
		s3.studentID=003;
		total+=1;
		
		System.out.println(total);
	}

}
