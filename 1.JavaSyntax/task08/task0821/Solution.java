package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //write your code here
        HashMap<String,String> hashMap = new HashMap<String, String>();

        hashMap.put("lastname1", "firstname1");
        hashMap.put("lastname2", "firstname1");
        hashMap.put("lastname1", "firstname2");
        hashMap.put("lastname2", "firstname3");
        hashMap.put("lastname3", "firstname3");
        hashMap.put("lastname4", "firstname3");
        hashMap.put("lastname5", "firstname4");
        hashMap.put("lastname6", "firstname5");
        hashMap.put("lastname7", "firstname6");
        hashMap.put("lastname8", "firstname7");

        return hashMap;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
