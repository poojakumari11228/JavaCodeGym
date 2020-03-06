package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        // write your code here
        ArrayList<String> toAdd = new ArrayList<String>();
        ArrayList<String> toRemove = new ArrayList<String>();

        for ( String list2 : list)
        {
            if( !( list2.contains("r") && list2.contains("l") ) )
            {

                if ( list2.contains("r"))
                    toRemove.add(list2);

                if( list2.contains("l"))
                    toAdd.add(list2);
            }

        }
        list.removeAll(toRemove);
        list.addAll(toAdd);
        return list;
    }
}