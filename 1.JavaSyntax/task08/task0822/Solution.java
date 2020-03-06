package com.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Minimum of N numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Find the minimum here

        //sort the array lis to get minimum nmbr at 0 index
        Collections.sort(array);
        return array.get(0);
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Create and initialize a list here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        ArrayList<Integer> nmbrs = new ArrayList<Integer>();

        for (int i=0; i<N; i++){
            nmbrs.add(Integer.parseInt(reader.readLine()));
        }
        return nmbrs;
    }
}
