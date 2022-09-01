package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.,"1");
        labels.put(2.,"2");
        labels.put(3., "3");
        labels.put(4., "4");
        labels.put(5., "5");
    }

    public static void main(String[] args) {

     /*   for (Map.Entry<Double, String> pair : labels.entrySet())
        {
            Double key = pair.getKey(); //ключ
            String value = pair.getValue(); //значение*/
            System.out.println(labels);
    //    }
      //  System.out.println(labels);
    }
}
