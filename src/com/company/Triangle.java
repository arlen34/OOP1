package com.company;

public class Triangle {
    float a,b,c,summa,perimetr;

    float area(){
        perimetr=(a+b+c)/2;
        return summa= (float) Math.sqrt(perimetr*(perimetr-a)*(perimetr-b)*(perimetr-c));
    }
}
