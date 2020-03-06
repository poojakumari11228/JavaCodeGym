package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //write your code here

        StringBuffer sb = new StringBuffer();

        int trackSpace = 0;

        for (int i=0; i<s.length(); i++){

            //change 1st char to upper case
            if (i==0 && !String.valueOf(s.charAt(i)).equals(" ") ){
                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
            }else if (String.valueOf(s.charAt(i)).equals(" ")){ // track space encountered
                sb.append(String.valueOf(s.charAt(i)));
                trackSpace++;
            }
            else   //change to upper case all words after space break
            if (trackSpace>0){
                if (!String.valueOf(s.charAt(i)).equals(" "))
                {
                    sb.append(String.valueOf(s.charAt(i)).toUpperCase());
                    trackSpace=0;
                }

            }
            else  sb.append(String.valueOf(s.charAt(i)));

        }

        System.out.println(sb);
    }
}
