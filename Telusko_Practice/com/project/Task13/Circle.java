package com.project.Task13;


class Circle extends Shape {
    int radius = 5;

    @Override
    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
    
}
