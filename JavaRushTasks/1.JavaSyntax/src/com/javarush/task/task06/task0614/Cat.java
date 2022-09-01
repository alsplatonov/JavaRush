package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i =0; i<10; i++){
            Cat cat = new Cat();
            Cat.cats.add(cat);
        }
       /* Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();*/
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (int i = 0; i<Cat.cats.size(); i++){
            System.out.println(cats);
        }
    }
}
