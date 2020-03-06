package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //write your code here

        strings = new ArrayList<String>();

        //read from keyboard and add to list
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<5; i++)
        {
            strings.add(reader.readLine());
        }
        // to store index of longest STrings

        int longest = strings.get(0).length();

        //find longest string
        for(int i=1; i<strings.size(); i++)
        {
         if (strings.get(i).length()>=longest)
         {
              longest = strings.get(i).length();
         }
        }
        //Display longest strings
        for (int i=0; i<strings.size(); i++)
        {
            if(strings.get(i).length()==longest)
            System.out.println(strings.get(i));
        }
    }
}
