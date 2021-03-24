package com.class17;

public class ClassStudents {
    String name;
    int math, lit, sci;


    ClassStudents(String nameSt, int Math, int Literature, int Science){
        this.name=nameSt;
        this.math=Math;
        this.lit=Literature;
        this.sci=Science;
    }

    double avg() {
        return (math+lit+sci)/3;
    }
}
