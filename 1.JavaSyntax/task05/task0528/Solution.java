package com.codegym.task.task05.task0528;

/* 
Display today's date

*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        DateFormat dateFormat = new SimpleDateFormat("MM dd YYY");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
}
