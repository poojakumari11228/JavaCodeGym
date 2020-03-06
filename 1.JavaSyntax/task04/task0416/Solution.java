package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble( reader.readLine() );

        double num = t % 5;

        if (num >= 0.0 && num < 3.0){
            System.out.println("green");
        }else if (num >= 3.0 && num < 4.0){
            System.out.println("yellow");
        }else if (num >= 4.0 && num < 5.0){
            System.out.println("red");
        }else  {
            System.out.println("green");
        }




    }
}