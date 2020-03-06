package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        // array of 20 length
        int[] nmbrs = new int[20];
        // 2 arays of 10 length
        int[] nmbr1 = new int[10];
        int[] nmbr2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //initialize fromm console
        for (int i=0; i<20;i++)
        {
            nmbrs[i] = Integer.parseInt(reader.readLine());
        }

        for (int i=0; i<20;i++)
        {
           if(i<10)
               nmbr1[i] = nmbrs[i];
           else
               nmbr2[i-10] = nmbrs[i];
        }
        for (int i=0; i<10;i++)
        {
            System.out.println(nmbr2[i]);
        }
    }
}
