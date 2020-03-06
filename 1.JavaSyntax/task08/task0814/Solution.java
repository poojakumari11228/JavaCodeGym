package com.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // write your code here
        HashSet<Integer> nmbrs = new HashSet<Integer>();

        for ( int i=0; i<20; i++){
            nmbrs.add(i);
        }
        return nmbrs;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // write your code here

        //create an iterator
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            if (iterator.next() > 10)
                iterator.remove();
        }

        for (Integer i : set)
            System.out.println(i);
        return set;
    }

    public static void main(String[] args) {



    }
}
