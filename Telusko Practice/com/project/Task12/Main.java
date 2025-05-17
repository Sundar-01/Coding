package com.project.Task12;
//Practice of Method Overloading
public class Main {

    public static void main(String[] args) {
        final float pi = 3.14f;

        Circle s = new Circle();
        Rectangle r = new Rectangle();

        s.area();
        s.area(pi, 4);
        r.area();
        r.area(4.1f, 2.1f);
    }
}
