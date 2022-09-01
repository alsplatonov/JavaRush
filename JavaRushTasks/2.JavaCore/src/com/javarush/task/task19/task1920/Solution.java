package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> stroki = new TreeMap<>();
        double max = 0;
        while (reader.ready())
        {
            String[] split = reader.readLine().split(" ");
            if (stroki.containsKey(split[0]))
            {
                stroki.put(split[0], stroki.get(split[0]) + Double.parseDouble(split[1]));
            }
            else
            {
                stroki.put(split[0], Double.parseDouble(split[1]));
            }
            if (stroki.get(split[0]) > max)
                max = stroki.get(split[0]);
        }
        reader.close();
        for (Map.Entry<String, Double> entry : stroki.entrySet())
        {
            if (entry.getValue() == max)
                System.out.println(entry.getKey());
        }
    }

}

