package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

     Cat cat1 = new Cat("Vaska", 12, 5, 10);
     Cat cat2 = new Cat("sfdg", 45,3,4);
     Cat cat3 = new Cat("dgfh", 41,2,8);

    boolean fight1 =  cat1.fight(cat2);
     System.out.println(fight1);

        boolean fight2 =  cat2.fight(cat3);
        System.out.println(fight2);

        boolean fight3 =  cat1.fight(cat3);
        System.out.println(fight3);
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
