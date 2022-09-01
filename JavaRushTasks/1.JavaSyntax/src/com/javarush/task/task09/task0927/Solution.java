package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> catHashMap = new HashMap<>();

        Cat cat1 = new Cat("cat1");
        Cat cat2 = new Cat("cat2");
        Cat cat3 = new Cat("cat3");
        Cat cat4 = new Cat("cat4");
        Cat cat5 = new Cat("cat5");
        Cat cat6 = new Cat("cat6");
        Cat cat7 = new Cat("cat7");
        Cat cat8 = new Cat("cat8");
        Cat cat9 = new Cat("cat9");
        Cat cat10 = new Cat("cat10");

        catHashMap.put("c1", cat1);
        catHashMap.put("c2", cat2);
        catHashMap.put("c3", cat3);
        catHashMap.put("c4", cat4);
        catHashMap.put("c5", cat5);
        catHashMap.put("c6", cat6);
        catHashMap.put("c7", cat7);
        catHashMap.put("c8", cat8);
        catHashMap.put("c9", cat9);
        catHashMap.put("c10", cat10);

        return catHashMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> catHashSet = new HashSet<>();

        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Cat> pair = iterator.next();
          //  String key = pair.getKey();            //ключ
            Cat value = pair.getValue();        //значение
            catHashSet.add(value);
        }
        return catHashSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
