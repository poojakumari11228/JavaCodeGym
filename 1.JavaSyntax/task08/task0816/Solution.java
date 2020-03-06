package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //write your code here

        map.put("Stall", df.parse("JUNE 1 1990"));
        map.put("John", df.parse("JULY 2 1980"));
        map.put("Jack", df.parse("AUGUST 5 1980"));
        map.put("Tom", df.parse("SEPTEMBER 10 1980"));
        map.put("Micheal", df.parse("OCTOBER 21 1980"));
        map.put("Mike", df.parse("NOVEMBER 11 1980"));
        map.put("Major", df.parse("DECEMBER 15 1980"));
        map.put("Nick", df.parse("JANUARY 19 1980"));
        map.put("Paul", df.parse("FEBRUARY 10 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //write your code here

        // iterator
        Iterator< Map.Entry<String,Date> >iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Date date = iterator.next().getValue();

            //  check if date lies in range of summer , summer lasts from June 1 to August 31
            if (date.getMonth()>=5 && date.getMonth()<=7){
                iterator.remove();
            }


        }

    }

    public static void main(String[] args) throws ParseException {
        removeAllSummerPeople(createMap());
    }
}
