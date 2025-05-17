package com.project.Task12point1;
//Practice of Method Overriding
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();     // Polymorphism
        Shape s2 = new Rectangle();  // Polymorphism

        s1.area(); // Calls Circle's area
        s2.area(); // Calls Rectangle's area
    }
}

