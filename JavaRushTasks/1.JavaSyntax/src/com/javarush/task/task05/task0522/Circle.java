package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Circle(double x) {
        this.x = x;
        this.y = 6;
        this.radius = 7;
    }

    public Circle() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {

    }
}