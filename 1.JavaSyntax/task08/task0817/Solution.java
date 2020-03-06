package com.codegym.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("lastname","firstname");
        hashMap.put("lastname2","firstname2");
        hashMap.put("lastname3","firstname");
        hashMap.put("lastname4","firstname2");
        hashMap.put("lastname5","firstname");
        hashMap.put("lastname6","firstname3");
        hashMap.put("lastname7","firstname4");
        hashMap.put("lastname8","firstname5");
        hashMap.put("lastname9","firstname6");
        hashMap.put("lastname10","firstname7");


        return hashMap;

    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here

        Iterator<String> iterator = map.values().iterator();

        ArrayList<String> arrayList = new ArrayList<String>();

        while (iterator.hasNext())
            arrayList.add(iterator.next());

        for (int i=0;i<arrayList.size(); i++){
            String value = arrayList.get(i);
            for (int j=i+1; j<arrayList.size(); j++){
                if (value.equals(arrayList.get(j)))
                {
                    // remove repeated e;lement
                    removeItemFromMapByValue(map,value);
                }
            }

        }




    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
      HashMap<String,String> hashMap =  createMap();
      removeFirstNameDuplicates(hashMap);
    }
}
