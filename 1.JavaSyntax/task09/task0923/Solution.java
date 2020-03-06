package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        // write your code here
        //read data
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //list for vowels
        ArrayList<Character> vowels = new ArrayList<>();
        // list for consonents and other characters
        ArrayList<Character> consonents = new ArrayList<>();

        for (int i=0; i<string.length(); i++)
        {
            if ( isVowel(string.charAt(i)) )
                vowels.add(string.charAt(i));
            else if ( !(string.charAt(i)+"").equals(" ") )
                consonents.add(string.charAt(i));
        }

        for (char c : vowels)
            System.out.print(c+" ");

        System.out.println();

        for (char c : consonents)
            System.out.print(c+" ");
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}