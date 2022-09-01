package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("AAA", df.parse("MAY 1 1980"));
        map.put("BBB", df.parse("APRIL 1 1980"));
        map.put("CCC", df.parse("JUNE 1 1980"));
        map.put("DDD", df.parse("JANUARY 1 1980"));
        map.put("EEE", df.parse("JUNE 1 1980"));
        map.put("FFF", df.parse("JUNE 1 1980"));
        map.put("GGG", df.parse("JUNE 5 1983"));
        map.put("HHH", df.parse("JUNE 7 1986"));
        map.put("LLL", df.parse("JULY 10 1990"));

        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry<String, Date> pair = it.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8 )
                it.remove();
        }

    }

    public static void main(String[] args) {

    }
}
