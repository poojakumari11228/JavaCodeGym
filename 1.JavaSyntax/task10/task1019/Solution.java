package com.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Functionality is not enough!

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();
//        Get input from keyboard

        while (true){
            String s = reader.readLine();
            Integer id;
            if (s.isEmpty())
                break;
            else {
               id = Integer.parseInt(s);
            }

            String name = reader.readLine();

            if (name.isEmpty())
            {
                System.out.println(id);
                break;
            }else
                map.put(name,id);
        }
//        Print map
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String index = pair.getKey();
            int name = pair.getValue();
            System.out.println(name + " " + index);
        }

    }
}
