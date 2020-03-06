package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String,String> hashMap = new HashMap<String, String>();

        hashMap.put("kumari","pooja");
        hashMap.put("kumari","sapna");  // same key not inserted
        hashMap.put("kmri","pooja");
        hashMap.put("kumari","sapna");  // same key not inserted
        hashMap.put("kumar","vijay");
        hashMap.put("kumari","vijay");  // same key not inserted
        hashMap.put("kum","poo");
        hashMap.put("ii","sa");
        hashMap.put("kr","oa");
        hashMap.put("mai","apna");
        hashMap.put("i","a");
        hashMap.put("r","o");
        hashMap.put("m","p");


        return hashMap;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        //write your code here

        int countSame = 0;
        Iterator<String> iterator = map.values().iterator();

        while (iterator.hasNext()){
            String currrentName = iterator.next();
           if (currrentName.equals(name))
               countSame++;
        }

        return countSame;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        //write your code here
        int countSame = 0;
        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()){
            if (iterator.next().equals(lastName))
                countSame++;
        }

        return countSame;
    }

    public static void main(String[] args) {

//        System.out.println(getSameFirstNameCount(createMap(),"pooja"));
//        System.out.println(getSameLastNameCount(createMap(),"pooja"));
    }
}
