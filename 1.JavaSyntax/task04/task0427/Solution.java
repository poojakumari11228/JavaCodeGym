package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if(number>=1 && number<=999)
        {
            // even single digit
            if(number%2==0 && ((number+"").toString().length())==1 )
                System.out.println("even single-digit number");
            //even 2 digit
            if(number%2==0 && ((number+"").toString().length())==2 )
                System.out.println("even two-digit number");
            //even 3 digit
            if(number%2==0 && ((number+"").toString().length())==3 )
                System.out.println("even three-digit number");

            // odd single digit
            if(number%2!=0 && ((number+"").toString().length())==1 )
                System.out.println("odd single-digit number");
            //odd 2 digit
            if(number%2!=0 && ((number+"").toString().length())==2 )
                System.out.println("odd two-digit number");
            //odd 3 digit
            if(number%2!=0 && ((number+"").toString().length())==3 )
                System.out.println("odd three-digit number");
        }

    }
}
