package com.codegym.task.task10.task1015;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //write your code here
         ArrayList<String> list = new ArrayList<>();
        list.add("Pooja");
        list.add("Kumari");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Software");
        list2.add("Engineer");

        ArrayList<String>[] arrayLists = new ArrayList[2];
        arrayLists[0] = list;
        arrayLists[1] = list2;

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}