package com.javarush.task.task15.task1527;

/*
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //add your code here


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        String obj = "";
        String URL;
        try {
             URL = reader.readLine();

           int ind =  URL.indexOf("?");

           URL = URL.substring(ind+1);

            if (URL.contains("obj")) {
                 obj = URL.substring(4, URL.indexOf("&")); //obj=(0123)
            }

            for (String retval : URL.split("&")) {

                if (retval.contains("="))
                System.out.print(retval.substring(0,retval.indexOf("=")) + " ");
                else System.out.print(retval + " ");
            }
            System.out.println();

            if (!obj.isEmpty()) {
                try {
                    alert(Double.parseDouble(obj));
                } catch (Exception e) {
                    alert(obj);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
