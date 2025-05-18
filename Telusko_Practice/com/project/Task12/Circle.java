package com.project.Task12;

public class Circle extends Shape {
    int radius;

    public void area(float pi, int r){
        int result = (int) pi * (r * r);
        System.out.println(result);
    }
}
