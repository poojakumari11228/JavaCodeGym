package com.codegym.task.task06.task0612;

/* 
Calculator

*/

public class Calculator {
    public static int plus(int a, int b) {
        //write your code here
        return a+b;
    }

    public static int minus(int a, int b) {
        //write your code here
        return a-b;
    }

    public static int multiply(int a, int b) {
        //write your code here
        return a*b;
    }

    public static double divide(int a, int b) {
        //write your code here
        return Double.parseDouble(String.valueOf(a/b));
    }

    public static double percent(int a, int b) {
        //write your code here
        return Double.parseDouble(String.valueOf((a*b)/100));
    }

    public static void main(String[] args) {

    }
}