package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<5;i++)
        {
            strings.add(reader.readLine());
        }
        for(int i=0; i<13;i++)
        {
            String temp = strings.get(strings.size()-1);
            strings.remove(strings.size()-1);
            strings.add(0,temp);
        }
        for(int i=0; i<strings.size();i++)
        {
            System.out.println(strings.get(i));
        }
    }
}
