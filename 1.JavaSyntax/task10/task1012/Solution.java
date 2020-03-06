package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // write your code here

        for (char letter : abcArray) {
            int count = 0;

//            Take each input line
            for (int i = 0; i < 10; i++) {
//                Search in each word of a line
                String line = list.get(i);
                for (int j=0; j<line.length(); j++)
                {
//                    Compare each letter
                    char c = line.charAt(j);
                    if(c == letter){
                        count++;
                    }
                }

            }
            System.out.println(letter+" "+count);
        }
    }

}
