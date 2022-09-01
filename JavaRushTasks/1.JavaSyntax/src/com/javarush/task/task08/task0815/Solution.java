package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("aa", "aaa");
        hashMap.put("bb", "bbb");
        hashMap.put("cc", "ccc");
        hashMap.put("dd", "ddd");
        hashMap.put("ee", "eee");
        hashMap.put("aaa", "aa");
        hashMap.put("bbb", "aaa");
        hashMap.put("ccc", "aaa");
        hashMap.put("ddd", "bb");
        hashMap.put("eee", "eee");
  //      hashMap.put("ff", "fff");
        return hashMap;


    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {

            String value = pair.getValue();      //значение
           if (value.equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код

        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            //ключ
            String key = pair.getKey();      //ключ
            if (key.equals(lastName)) count++;
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
