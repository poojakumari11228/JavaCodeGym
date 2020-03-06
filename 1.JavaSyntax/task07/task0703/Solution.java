package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] nmbrs = new int[10];
        String strings[] = new String[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<10;i++)
        {
            strings[i] = reader.readLine();
            nmbrs[i] = strings[i].length();
        }
        for (int i=0; i<10;i++)
        {
            System.out.println(nmbrs[i]);
        }

    }
}
