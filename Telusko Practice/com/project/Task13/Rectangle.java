package com.project.Task13;

public class Rectangle extends Shape {
    int length = 5;
    int width = 3;

    void area(){
        int result = length * width;
        System.out.println("Area of Rectangle : " + result);
    }

    void display(){
        System.out.println("This is also a Shape");
    }
}
