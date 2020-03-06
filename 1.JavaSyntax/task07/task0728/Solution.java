package com.codegym.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
In decreasing order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //write your code here

        for(int j=0; j<array.length; j++) {
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] < array[i]) {
                    int temp = array[i-1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
