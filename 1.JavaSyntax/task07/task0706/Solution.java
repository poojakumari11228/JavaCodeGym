package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] nmbrs = new int[15];
        int evenSum = 0;
        int oddSum = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<15;i++)
        {
            nmbrs[i] = Integer.parseInt(reader.readLine());
        }

        for (int i=0; i<15;i++)
        {
           if(i%2==0)
               evenSum+=nmbrs[i]; // add even nmbrs
           else
               oddSum+=nmbrs[i];// add odd nmbrs
        }
        // check which one is greater
        if(evenSum>oddSum)
            System.out.println("Even-numbered houses have more residents.");
        else
            System.out.println("Odd-numbered houses have more residents.");

    }
}
