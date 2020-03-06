package com.codegym.task.task09.task0903;

/* 
Who called me?

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        return  /*write your code here*/  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        method3();
        return  /*write your code here*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
        return  /*write your code here*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
        return  /*write your code here*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
        return  /*write your code here*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
