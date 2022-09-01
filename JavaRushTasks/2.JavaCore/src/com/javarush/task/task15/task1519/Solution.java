package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String list = reader.readLine();

        while (!list.equals("exit")){
            try {
                if (list.contains(".")) {
                    print(Double.parseDouble(list));
                }
                 else if(Integer.parseInt(list)<=0 || Integer.parseInt(list)>=128) print(Integer.parseInt(list));
                 else if(Short.parseShort(list)>0 && Short.parseShort(list)<128 ) print(Short.parseShort(list));


            } catch (Exception e){
                print(list);
            }
          //  boolean t = list.contains(".");



             list = reader.readLine();

        }



    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
