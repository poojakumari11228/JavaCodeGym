package com.codegym.task.task05.task0522;

/* 
Max constructors

*/

public class Circle {
    public double x;
    public double y;
    public double radius;
    public double diameter;

    //write your code here
    public Circle(double x, double y, double radius, double diameter)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.diameter = diameter;
    }
    public Circle(double x, double y, double radius)
    {
        this(x, y, radius, 2);
    }

    public Circle(double x, double y)
    {
        this(x, y, 2, 2);
    }

    public Circle(double x)
    {
        this(x, 3, 2, 2);
    }

    public Circle()
    {
        this(2,2,2,2);
    }

    public static void main(String[] args) {

    }
}