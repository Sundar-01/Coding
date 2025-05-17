package com.project.Task13;
//Practice for Abstract class
public class Main {
    public static void main(String[] args) {
        Shape s = new Circle();  // polymorphism
        s.display();
        s.area();
        s = new Rectangle();
        s.display();
        s.area();
    }
}
