package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "z1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "z2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "z3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "z4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "z5";

        Protoss prot1 = new Protoss();
        prot1.name = "p1";
        Protoss prot2 = new Protoss();
        prot2.name = "p2";
        Protoss prot3 = new Protoss();
        prot3.name = "p3";

        Terran ter1 = new Terran();
        ter1.name = "t1";
        Terran ter2 = new Terran();
        ter2.name = "t2";
        Terran ter3 = new Terran();
        ter3.name = "t3";
        Terran ter4 = new Terran();
        ter4.name = "t4";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
