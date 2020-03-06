package com.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Improving functionality

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b,c,d,e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        // storing nmbers in array
        int nmbr[] = new int[4];
         nmbr[0] = a;
         nmbr[1] = b;
         nmbr[1] = c;
         nmbr[1] = d;
         nmbr[1] = e;
         //initially set 1st nmber as smaller
        int mini=nmbr[0];
        // compare 1st with all others if found less than 1st number then store in mini variable
        for(int i =1;i<nmbr.length; i++){
            if(mini>nmbr[i]){
                mini = nmbr[i];
            }
        }
//        if(a<b && a<c && a<d && a<e)
//            mini = a;
//        else if(b<a && b<c && b<d && b<e)
//            mini = b;
//        else if(c<a && c<b && c<d && c<e)
//            mini = c;
//        else if(d<a && d<b && d<c && b<e)
//            mini = d;
//        else if(e<a && e<b && e<d && e<c)
//            mini = e;
       return mini;
    }
}
