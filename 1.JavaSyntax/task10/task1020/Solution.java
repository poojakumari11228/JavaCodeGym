package com.codegym.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        //write your code here

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i=0; i<array.length; i++)
        {
            arr.add(array[i]);
            }
        Collections.sort(arr);

        for (int i=0; i<array.length; i++)
        {
            array[i] = arr.get(i);
        }

    }
}
