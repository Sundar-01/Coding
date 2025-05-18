package com.project.Task12point1;

public class Circle extends Shape {
    int radius = 4;

    @Override
    public void area() {
        float pi = 3.14f;
        float result = pi * radius * radius;
        System.out.println("Circle Area : " + result);
    }
}
