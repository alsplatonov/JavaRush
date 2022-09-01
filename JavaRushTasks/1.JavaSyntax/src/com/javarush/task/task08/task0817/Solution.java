package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
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
        return hashMap;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код

        HashMap<String, String> copy1 = new HashMap<String, String>(map);
        Iterator<Map.Entry<String,String>> iterator =  copy1.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            Iterator<Map.Entry<String,String>> iterator1 =  copy1.entrySet().iterator();

            while(iterator1.hasNext()) {
                Map.Entry<String, String> pair2 = iterator1.next();
                String key1 = pair2.getKey();
                String value2 = pair2.getValue();
                if (key1 != key && value2 == value) {
                    removeItemFromMapByValue(map, value2);

                }
            }
        }


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

   /*     HashMap<String, String> mp = createMap();
        removeTheFirstNameDuplicates(mp);

        for (Map.Entry<String, String> pair : mp.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }*/

    }
}
