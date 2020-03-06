package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Map for cities and fammilies;
        HashMap<String,String> hashMap = new HashMap<String, String>();

        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();

            hashMap.put(city,family);
        }
        // Read the city name
        String city = reader.readLine();
        System.out.println(hashMap.get(city));

    }
}
