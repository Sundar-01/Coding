package com.project.Task12;

public class Rectangle extends Shape {
    float length;
    float width;
    public void area(float l, float w){
        float result = (int) l * w;
        System.out.println(result);
    }
}
