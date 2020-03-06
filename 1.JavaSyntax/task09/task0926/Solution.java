package com.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
List of number arrays

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //write your code here
        ArrayList<int[]> arrayList = new ArrayList<>();
        arrayList.add(new int[]{1, 3, 5, 7, 9});
        arrayList.add(new int[]{3,5});
        arrayList.add(new int[]{2,4,6,8});
        arrayList.add(new int[]{1,2,3,4,5,6,7});
        arrayList.add(new int[0]);



        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
