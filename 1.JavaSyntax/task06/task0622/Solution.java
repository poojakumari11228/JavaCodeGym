package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ascending numbers

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        int num[] = new int[5];

        //read 5 numbers
        for(int i=0; i<5; i++){
            num[i] = Integer.parseInt(reader.readLine());
        }

        for(int j=0; j<5; j++)
        {
            for(int i=0; i<4; i++)
            {
                if(num[i]>num[i+1])
                {
                    int temp = num[i];
                    num[i] = num[i+1];
                    num[i+1] = temp;
                }
             }
        }
        //Display numbers
        for(int i=0; i<5; i++){
            System.out.println(num[i]);
        }


    }
}
