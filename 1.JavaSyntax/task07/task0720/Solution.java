package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shuffled just in time

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        ArrayList<String> strings = new ArrayList<String>();
        //to make Move array
        String moveStr[] = new String[M];

        //read string from console
        for (int i=0; i<N; i++)
        {
            strings.add(reader.readLine());
        }
        //make a move list and remove it from beginning
        for (int i=0; i<M; i++)
        {
            moveStr[i] = strings.get(0);
            strings.remove(0);
        }
        //move to the end
        for (int i=0; i<M; i++)
            strings.add(moveStr[i]);

        for (String s : strings)
            System.out.println(s);
    }
}
