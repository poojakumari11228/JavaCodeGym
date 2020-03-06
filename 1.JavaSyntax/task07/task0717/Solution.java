package com.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplicating words

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i=0; i<10; i++)
            list.add(reader.readLine());

        ArrayList<String> result = doubleValues(list);

        // Display result
        for (String x : result)
            System.out.println(x);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //write your code here
        ArrayList<String> newlist = new ArrayList<String>();
        for (String s : list)
        {
            for(int i=0; i<2; i++)
            {
                newlist.add(s);
            }
        }
        return newlist;
    }
}
