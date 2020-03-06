package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list for all nmbrs
        ArrayList<Integer> nmbrs = new ArrayList<Integer>();

        //list for no divisible by 3
        ArrayList<Integer> nmbrs3 = new ArrayList<Integer>();

        //list for n0 divisble by 2
        ArrayList<Integer> nmbrs2 = new ArrayList<Integer>();

        //list for remaining nmbers
        ArrayList<Integer> nmbrsOther = new ArrayList<Integer>();

        //read 20 numbers
        for(int i=0; i<20; i++)
        {
            nmbrs.add(Integer.parseInt(reader.readLine()));
        }

        for ( int i = 0; i<nmbrs.size(); i++)
        {
            if ( nmbrs.get(i) % 2 == 0)
                nmbrs2.add(nmbrs.get(i));

            if ( nmbrs.get(i) % 3 == 0)
                nmbrs3.add(nmbrs.get(i));

            if ( nmbrs.get(i) % 2 != 0 && nmbrs.get(i) % 3 != 0)
                nmbrsOther.add(nmbrs.get(i));
        }

        printList(nmbrs3);
        printList(nmbrs2);
        printList(nmbrsOther);
    }

    public static void printList(List<Integer> list) {
        //write your code here
        for( Integer x : list)
            System.out.println(x);
    }
}
