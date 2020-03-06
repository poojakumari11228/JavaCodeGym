package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //write your code here
        ArrayList<Integer> arrayList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        try {
            while(true){
                int nmbr = Integer.parseInt(reader.readLine());
                arrayList.add(nmbr);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException e) {
            for ( int i : arrayList)
                System.out.println(i);
        }


    }
}
