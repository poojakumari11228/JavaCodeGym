package com.codegym.task.task10.task1011;

/* 
Big salary

*/

public class Solution {
    public static void main(String[] args) {
        String s = "I do not want to learn Java. I want a big salary";

        //write your code here

        for ( int j=0; j<43; j++){

            for ( int i=j; i<s.length(); i++){
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }

}

