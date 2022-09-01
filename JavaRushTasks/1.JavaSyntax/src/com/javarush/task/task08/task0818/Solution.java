package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код

        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("aa", 350);
        hashMap.put("bb", 1200);
        hashMap.put("cc", 100);
        hashMap.put("dd", 500);
        hashMap.put("ee", 600);
        hashMap.put("aaa", 800);
        hashMap.put("bbb", 50);
        hashMap.put("ccc", 320);
        hashMap.put("ddd", 5000);
        hashMap.put("eee", 700);
        return hashMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код

        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            int salary = pair.getValue();
            if (salary<500)
                map.remove(pair.getKey());
                }

    }

    public static void main(String[] args) {

/*
        HashMap<String, Integer> mp = createMap();
        removeItemFromMap(mp);

        for (Map.Entry<String, Integer> pair : mp.entrySet())
        {
            String key = pair.getKey();                      //ключ
            Integer value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }*/

    }
}