package com.class17;

public class StudentTest {
    public static void main(String[] args){
        ClassStudents obj1=new ClassStudents("Peter",95, 45, 80);
        System.out.println(obj1.name+"'s average grade is "+obj1.avg());
        ClassStudents obj2=new ClassStudents("Emily",50, 85, 60);
        System.out.println(obj2.name+"'s average grade is "+obj2.avg());
        ClassStudents obj3=new ClassStudents("Jacob",80, 75, 80);
        System.out.println(obj3.name+"'s average grade is "+obj3.avg());
        ClassStudents obj4=new ClassStudents("Eva",75, 75, 50);
        System.out.println(obj4.name+"'s average grade is "+obj4.avg());
        ClassStudents obj5=new ClassStudents("Franzi",25, 45, 30);
        System.out.println(obj5.name+"'s average grade is "+obj5.avg());
    }
}
