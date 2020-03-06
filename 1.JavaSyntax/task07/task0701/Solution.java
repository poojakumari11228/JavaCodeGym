package com.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maximum in an array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // Create and populate the array
        int numbrs[] = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<numbrs.length; i++)
            numbrs[i] = Integer.parseInt(reader.readLine());
        return numbrs;
    }

    public static int max(int[] array) {
        // Find the maximum
        int max = array[0];

        for (int i=1; i<array.length; i++)
        {
            if(max<array[i])
                max = array[i];
        }
        return max;
    }
}
