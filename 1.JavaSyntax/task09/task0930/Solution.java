package com.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // write your code here

        // arraylists for sorting
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> nmbrs = new ArrayList<>();
        // maps to tract the indexes of nmbers and strings
        HashMap<Integer,Integer> nmbrIndex = new HashMap<>();
        HashMap<Integer,String> strIndex = new HashMap<>();

        // add nmbrs to nmbr arraylist and strings to string arraylist
        for (int i=0; i<array.length; i++){
            if ( isNumber(array[i]) ){
                nmbrs.add(Integer.parseInt(array[i]));
                nmbrIndex.put(i,Integer.parseInt(array[i]));
            }else {
                strings.add(array[i]);
                strIndex.put(i,array[i]);
            }
        }
        //Size of nmbrs and strings
        int lengthOfNmbrs = nmbrs.size();
        int lengthOfStrings = strings.size();

        //sort nmbrs in descending order
        Collections.sort(nmbrs,Collections.reverseOrder());

        // set descending ordered nmbers in array to those positions where there was nmbers

        int count=0;
        for (Integer i : nmbrIndex.keySet()){
            array[i] = nmbrs.get(count).toString();
            count++;
        }

        //sort strings in assending order
        for (int j=0; j<lengthOfStrings; j++){
            for (int i=j+1; i<lengthOfStrings; i++){

                if (isGreaterThan(strings.get(j),strings.get(i))){
                    //swap
                    String temp = strings.get(i);
                    strings.set(i, strings.get(j));
                    strings.set(j, temp);
                }
            }
        }
        // set asscending ordered strings in array to those positions where there was strings

        count=0;
        for (Integer i : strIndex.keySet()){
            array[i] = strings.get(count);
            count++;
        }

    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Is the passed string a number?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // The string contains a hyphen
                    || (!Character.isDigit(c) && c != '-') // or is not a number and doesn't start with a hyphen
                    || (i == 0 && c == '-' && chars.length == 1)) // or is a single hyphen
            {
                return false;
            }
        }

        return true;
    }
}
