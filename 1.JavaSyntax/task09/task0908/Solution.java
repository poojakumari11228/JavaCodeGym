package com.codegym.task.task09.task0908;

/* 
Exception while working with strings

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        try {

            String s = null;
            String m = s.toLowerCase();

            //write your code here
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
