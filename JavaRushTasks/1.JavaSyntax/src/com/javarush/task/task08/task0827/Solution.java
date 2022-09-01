package com.javarush.task.task08.task0827;

/*
Работа с датой
*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Solution  {
    public static void main(String[] args) throws Exception{
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws Exception {

        SimpleDateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(new Date(date)); можно и без форматирования даты
        calendar.setTime(format.parse(date)); // с SimpleDateFormat более универсальное решение
        return calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0;
    }
}
