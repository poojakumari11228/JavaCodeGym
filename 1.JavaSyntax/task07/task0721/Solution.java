package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //write your code here
        int nmbrs[] = new int[20];

        for (int i=0; i<20; i++)
        {
          nmbrs[i] = Integer.parseInt(reader.readLine());
        }
        //let inittialy maximum is 1st nmbr
        maximum = nmbrs[0];

        // find maximum
        for (int i=1; i<20; i++)
        {
            if (nmbrs[i]>maximum)
                maximum = nmbrs[i];
        }

        //let initialy minimun is 1st nmbr
        minimum = nmbrs[0];

        // find minimum
        for (int i=1; i<20; i++)
        {
            if (nmbrs[i]<minimum)
                minimum = nmbrs[i];
        }

        System.out.print(maximum + " " + minimum);
    }
}
