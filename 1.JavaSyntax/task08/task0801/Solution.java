package com.codegym.task.task08.task0801;

/* 
HashSet of plants

*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        //create a hashset
        HashSet<String> plants = new HashSet<String>();

        // add 10 plants
        plants.add("watermelon");
        plants.add("banana");
        plants.add("cherry");
        plants.add("pear");
        plants.add("cantaloupe");
        plants.add("blackberry");
        plants.add("ginseng");
        plants.add("strawberry");
        plants.add("iris");
        plants.add("potato");

        //display list each on new line
        for (String s : plants)
            System.out.println(s);


    }
}
