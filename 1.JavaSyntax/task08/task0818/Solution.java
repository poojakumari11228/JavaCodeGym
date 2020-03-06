package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //write your code here
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("a",10);
        hashMap.put("b",100);
        hashMap.put("c",1000);
        hashMap.put("d",1000);
        hashMap.put("e",10000);
        hashMap.put("f",100000);
        hashMap.put("g",1000000);
        hashMap.put("h",10000000);
        hashMap.put("i",100000000);
        hashMap.put("j",1000000000);

        return hashMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //write your code here
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            if (iterator.next().getValue()<500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}