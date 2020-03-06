package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> arrayListForLength = new ArrayList<Integer>();

        // get 10 nmbrs from console
        for ( int i=0; i<10; i++){
            arrayList.add(Integer.parseInt(reader.readLine()));
        }

        // track sequence for all nmbrs
        for ( int j = 0; j<arrayList.size(); j++ ){
            int length = 0;
            int nmbr = arrayList.get(j);

            // if its 1st element then check forward steps , othrwise first check 1 step backward thn check forward step
            int i = ( (j == 0) ? (j) : (j-1) );
            for (  ; i<arrayList.size(); i++){
                if (arrayList.get(i) == nmbr)
                    length++;
                else
                    break;
            }
            arrayListForLength.add(length);
        }

        //get longest repeated sequence
        int longest = arrayListForLength.get(0);
        for ( int i=0; i<arrayListForLength.size(); i++){
            if (arrayListForLength.get(i) > longest)
                longest = arrayListForLength.get(i);
        }

        System.out.println(longest);
    }
}