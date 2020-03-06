package com.codegym.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 10 2019"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new SimpleDateFormat("MMMM d yyyy").parse(date));
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);

        if (dayOfYear%2 ==0)
            return false;
        else
            return true;

    }
}
