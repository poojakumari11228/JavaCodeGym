package com.codegym.task.task06.task0606;

import java.io.*;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nmbr = reader.readLine();

        for(int i=0; i<nmbr.length(); i++)
        {
            if(nmbr.charAt(i)%2==0){
                even++;
            }else
                odd++;
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
