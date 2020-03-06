package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<10;i++)
        {
            strings.add(reader.readLine());
        }

        // to store index of longest STrings
        int longest = strings.get(0).length();
        int longindex = 0;

        //find longest string
        for(int i=1; i<strings.size(); i++)
        {
            if (strings.get(i).length()>longest)
            {
                longest = strings.get(i).length();
                longindex = i;
            }
        }

        // to store index of shortest STrings
        int shortest = strings.get(0).length();
        int shortindex = 0;

        //find shortest string
        for(int i=1; i<strings.size(); i++)
        {
            if (strings.get(i).length()<shortest)
            {
                shortest = strings.get(i).length();
                shortindex = i;
            }
        }
        // check which occoured 1st ,shoetest or longest
        if(shortindex<longindex)
            System.out.println(strings.get(shortindex));
        else
            System.out.println(strings.get(longindex));
    }
}
