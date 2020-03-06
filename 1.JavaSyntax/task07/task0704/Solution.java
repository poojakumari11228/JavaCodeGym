package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] nmbrs = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<10;i++)
        {
            nmbrs[i] = Integer.parseInt(reader.readLine());
        }
        for (int i=0; i<10;i++)
        {
            System.out.println(nmbrs[9-i]);
        }
    }
}

