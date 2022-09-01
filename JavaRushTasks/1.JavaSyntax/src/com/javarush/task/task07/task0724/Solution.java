package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human grandMa1 = new Human("Бабка1", false, 85);
        Human grandMa2 = new Human("Бабка2", false, 75);

        Human grandPa1 = new Human("Дед1", true, 83);
        Human grandPa2 = new Human("Дед2", true, 89);

        Human Father = new Human("Отец", true, 45, grandMa1, grandPa1);
        Human Mother = new Human("Мать", false, 39, grandMa2, grandPa2);

        Human Child1 = new Human("Ребенок1", true, 15, Father, Mother);
        Human Child2 = new Human("Ребенок2", false, 25, Father, Mother);
        Human Child3 = new Human("Ребенок3", true, 5, Father, Mother);

        System.out.println(grandMa1.toString());
        System.out.println(grandMa2.toString());

        System.out.println(grandPa1.toString());
        System.out.println(grandPa2.toString());

        System.out.println(Father.toString());
        System.out.println(Mother.toString());

        System.out.println(Child1.toString());
        System.out.println(Child2.toString());
        System.out.println(Child3.toString());

    }

    public static class Human {
        //напишите тут ваш код

        private String name;
        private boolean sex;
        private int age;
        private  Human father;
        private  Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
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

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















