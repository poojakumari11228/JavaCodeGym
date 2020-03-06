package com.codegym.task.task05.task0520;

/* 
Create a Rectangle class

*/


public class Rectangle {
    //write your code here
    int top, left, width , height;

    public Rectangle()
    {
        this.top = 2;
        this.left = 23;
        this.width = this.height = 0;
    }

    public  Rectangle(int top){
        this.top = top;
        this.left = 23;
        this.width = this.height = 0;

    }
    public  Rectangle(int top,int left){
        this.top = top;
        this.left = left;
        this.width = this.height = 0;

    }
    public Rectangle (int top,int left,int height){
        this.top = top;
        this.left = left;
        this.width = this.height = height;

    }

    public  Rectangle(int top,int left,int height,int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;

    }

    public static void main(String[] args) {

    }
}
