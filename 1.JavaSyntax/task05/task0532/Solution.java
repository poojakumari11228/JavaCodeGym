package com.codegym.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = 0;

        //write your code here
        ArrayList<String> nmbrs = new ArrayList<String>();
        String line = "";
        while((line=reader.readLine())!=null){
            nmbrs.add(line);

        }
        maximum = Integer.parseInt(nmbrs.get(0));
        for(int i=1; i<nmbrs.size(); i++){
            if(maximum<Integer.parseInt(nmbrs.get(i))){
                maximum =Integer.parseInt(nmbrs.get(i));
            }

        }
        System.out.println(maximum);
    }
}
