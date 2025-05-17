package com.project.Task12point1;

public class Rectangle extends Shape {
    float length = 4.1f;
    float width = 2.1f;

    @Override
    public void area() {
        float result = length * width;
        System.out.println("Rectangle Area : " + result);
    }
}

