/*Write a java program to calculate area using method overloading for circle,rectangle,triangle */

import java.util.*;

public class Overloading {

    // Area of a Circle: π * r^2
    public void area(double radius) {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + result);
    }

    // Area of a Rectangle: length * breadth
    public void area(double length, double breadth) {
        double result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }

    // Area of a Triangle: (1/2) * base * height
    public void area(float base, float height) {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle = " + result);
    }

    // Main method
    public static void main(String[] args) {
        Overloading obj = new Overloading();

        obj.area(5.0);                 // Circle with radius 5.0
        obj.area(4.0, 6.0);            // Rectangle with length 4.0 and breadth 6.0
        obj.area(3.0f, 5.0f);          // Triangle with base 3.0 and height 5.0
    }
}

/*
 output

Area of Circle = 78.53981633974483
Area of Rectangle = 24.0
Area of Triangle = 7.5
 */
