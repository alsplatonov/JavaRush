package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы Run, Swim
*/

public class Solution {
    public static void main(String[] args) {

    }
    public interface Swim{
        void swim();
    }

    public interface Run{
        void run();
    }

    public abstract class Human implements Swim, Run{

    //    public abstract void swim();


   //     public abstract void run();
    }

    //add public interfaces and public class here - добавь public интерфейсы и public класс тут
}
