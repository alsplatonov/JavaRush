package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> catResult = new HashSet<Cat>();
        for (int i = 0; i <4 ; i++) {
            catResult.add(new Cat());
        }
        return catResult;

        //напишите тут ваш код

    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> dogResult = new HashSet<Dog>();
        //напишите тут ваш код
        for (int i = 0; i <3 ; i++) {
            dogResult.add(new Dog());
        }
        return dogResult;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {

        HashSet<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);

        //напишите тут ваш код
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        HashSet<Object> copy = new HashSet<>(pets);

        Iterator<Object> iterator = copy.iterator();
        while (iterator.hasNext())
        {
            Object obj = iterator.next();

            Iterator<Cat> iterator2 = cats.iterator();
            while (iterator2.hasNext())
            {
                Cat cat = iterator2.next();
                if (obj.equals(cat)) pets.remove(cat);
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object text : pets)
        {
            System.out.println(text);
        }
    }

    //напишите тут ваш код

    public static class Dog{
        public Dog(){}
    }

    public static class Cat{
        public Cat(){}
    }
}
