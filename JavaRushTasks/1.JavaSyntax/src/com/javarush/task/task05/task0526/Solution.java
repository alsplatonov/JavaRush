package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("AAa", 25,"sdfsf");
        System.out.println(man1.toString());

        Man man2 = new Man("AAAA");
        System.out.println(man2.toString());

        Man man3 = new Man("AAAA", 23, "wffdg");
        System.out.println(man3.toString());

        Woman woman1 = new Woman("BBB", 36, "ssfv");
        System.out.println(woman1.toString());

        Woman woman2 = new Woman("BBBB");
        System.out.println(woman2.toString());

        Woman woman3 = new Woman("sfdg", 45, "sfsffsf");
        System.out.println(woman3.toString());
    }

    public static class Man {

        public  String name;
        public int age;
        public  String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man(String name){
            this.name = name;
            this.age = 52;
            this.address = "Man address";
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        public  String name;
        public int age;
        public  String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman(String name){
            this.name = name;
            this.age = 52;
            this.address = "Woman address";
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    //напишите тут ваш код
}
