package com.javarush.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Валюты
*/

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
          //  this.allMoney = new ArrayList<Money>();
            this.allMoney = getAllMoney();
            //напишите тут ваш код
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {

            ArrayList<Money> allMoney = new ArrayList<>();
            allMoney.add(new USD(10));
            allMoney.add(new Ruble(20));
            allMoney.add(new Hrivna(30));

            return allMoney;
        }
    }
}
