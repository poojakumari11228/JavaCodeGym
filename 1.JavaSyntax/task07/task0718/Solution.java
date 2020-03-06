package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        // Read strings from the console and declare an ArrayList here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i=0; i<10; i++)
            list.add(reader.readLine());

        // to track the length of strings
        int strlength = list.get(0).length();

        for (int i=1; i<list.size(); i++)
        {
            if(list.get(i).length()>strlength) // if no: are in increasing order
            {
                strlength = list.get(i).length();
            }else
                {
                    System.out.println(i);
                    break;
                }
        }
    }
}

