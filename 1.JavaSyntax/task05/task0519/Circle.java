package com.codegym.task.task05.task0519;

/* 
Walking in circles

*/


public class Circle {
    //write your code here
    int  centerX, centerY, radius, width , color;

    public Circle(int centerX, int centerY,int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = 34;
        this.color = 343;
    }
    public Circle(int centerX, int centerY,int radius,int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = 3;
    }

    public Circle(int centerX, int centerY,int radius,int width,int color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color= color;
    }

    public static void main(String[] args) {

    }
}
