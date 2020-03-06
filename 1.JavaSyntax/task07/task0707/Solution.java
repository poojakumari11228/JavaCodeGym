package com.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
What sort of list is that?

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> list = new ArrayList<String>();
        list.add("suman");
        list.add("pooja");
        list.add("vijay");
        list.add("mameeta");
        list.add("sapna");

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
