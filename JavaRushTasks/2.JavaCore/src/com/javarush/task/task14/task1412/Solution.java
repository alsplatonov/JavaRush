package com.javarush.task.task14.task1412;

/* 
Реализовать метод printMainInfo
*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Circle();
     //   ((Circle) obj).draw();
     //   ((Circle) obj).move();

        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();
     //   drawable.draw();
     //   ((Rectangle) drawable).move();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {
        if (object instanceof Drawable) ((Drawable) object).draw();
        if (object instanceof Movable) ((Movable) object).move();

        //напишите тут ваш код
    }

    static interface Movable {

        void move();
    }

    static class Circle implements Movable {

        public void draw() {
            System.out.println("can be drawn");
        }

        public void move() {
            System.out.println("can be moved");
        }

    }

    static interface Drawable {
        void draw();
    }

    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("can be drawn");
        }

        public void move() {
            System.out.println("can be moved");
        }
    }
}
