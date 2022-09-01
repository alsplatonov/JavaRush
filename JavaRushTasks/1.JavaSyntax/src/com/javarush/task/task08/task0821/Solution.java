package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код

        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("aaa", "aaa");
        hashMap.put("bb", "bbb");
        hashMap.put("cc", "ccc");
        hashMap.put("dd", "ddd");
        hashMap.put("ee", "eee");
        hashMap.put("aaa", "aa");
        hashMap.put("bbb", "aaa");
        hashMap.put("ccc", "aaa");
        hashMap.put("ddd", "bb");
        hashMap.put("eee", "eee");
        return hashMap;


    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
