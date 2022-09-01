package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        printCats(cats);
            //напишите тут ваш код. step 3 - пункт 3
        Iterator iterator = cats.iterator();
        cats.remove(iterator.next());

    //    printCats(cats);
    }

    public static Set<Cat> createCats() {

        Set<Cat> cat = new HashSet<>();
   /*   Cat cat1 =  new Cat("AAA");
        Cat cat2 =  new Cat("BBB");
        Cat cat3 =  new Cat("CCC");*/

        Cat cat1 =  new Cat();
        Cat cat2 =  new Cat();
        Cat cat3 =  new Cat();
        cat.add(cat1);
        cat.add(cat2);
        cat.add(cat3);
        return cat;
        //напишите тут ваш код. step 2 - пункт 2

    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4

        for (Cat cat : cats)
        {
            System.out.println(cat/*.toString()*/);
        }
    }

    // step 1 - пункт 1
    public static class Cat{
    //    private String name;

        public Cat(){}

     /*   public Cat(String name){
            this.name = name;
        }
        @Override
        public String toString(){
            return name;
        }*/

    }
}
