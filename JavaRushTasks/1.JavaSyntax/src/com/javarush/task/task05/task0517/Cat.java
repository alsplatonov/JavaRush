package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код

    private String name;
    private  int age;
    private  String color;
    private int weight;
    private  String address;

    public Cat(String name){
        this.name = name;
        this.age = 3;
        this.color = "white";
        this.weight = 6;
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "red";
    }

    public Cat(String name, int age){
        this.name = name;
        this.weight = 5;
        this.age = age;
    }

    public Cat(int weight, String color){

        this.age = 4;
        this.weight = weight;
        this.color= color;
    }

    public Cat(int weight, String color, String address){
        this.age = 2;
        this.weight = weight;
        this.color= color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
