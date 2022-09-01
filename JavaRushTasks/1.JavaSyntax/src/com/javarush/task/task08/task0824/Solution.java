package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код



        ArrayList<Human> child1 = new ArrayList<>();

        ArrayList<Human> child2 = new ArrayList<>();

        Human Child1 = new Human("Ребенок1", true, 15);
        Human Child2 = new Human("Ребенок2", false, 25);
        Human Child3 = new Human("Ребенок3", true, 5);

        ArrayList<Human> children = new ArrayList<>();
        children.add(Child1);
        children.add(Child2);
        children.add(Child3);

        Human Father = new Human("Отец", true, 45, children);
        Human Mother = new Human("Мать", false, 39, children);

        child1.add(Father);
        child2.add(Mother);

        Human grandMa1 = new Human("Бабка1", false, 85, child1);
        Human grandMa2 = new Human("Бабка2", false, 75, child2);

        Human grandPa1 = new Human("Дед1", true, 83, child1);
        Human grandPa2 = new Human("Дед2", true, 89, child2);
        System.out.println(grandMa1.toString());
        System.out.println(grandMa2.toString());

        System.out.println(grandPa1.toString());
        System.out.println(grandPa2.toString());

        System.out.println(Father.toString());
        System.out.println(Mother.toString());

        for (int i = 0; i <children.size() ; i++) {
            System.out.println(children.get(i).toString());

        }

    }

    public static class Human {
        //напишите тут ваш код
         String name;
         boolean sex;
         int age;
         ArrayList<Human> children;



        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;


        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.children!=null) {
                int childCount = this.children.size();
                if (childCount > 0) {
                    text += ", дети: " + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++) {
                        Human child = this.children.get(i);
                        text += ", " + child.name;
                    }
                }
            }
            return text;
        }
    }

}
