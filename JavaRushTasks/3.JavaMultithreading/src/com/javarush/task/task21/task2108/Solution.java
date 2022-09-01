package com.javarush.task.task21.task2108;

import java.util.Arrays;

/*
Клонирование растений
*/
public class Solution {
    public static void main(String[] args) {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        Tree clone = null;
        try {
            clone = (Tree)tree.clone();
   //     } catch (CloneNotSupportedException e) {
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(tree.branches);
        System.out.println(clone.branches);
    }

    public static class Plant{
        private String name;

        public Plant(){};

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Object clone(){
            Plant plant = new Plant(this.name);
            return plant;
        }
    }

    public static class Tree extends Plant implements Cloneable{
        private String[] branches;

        public Tree(){};

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        public String[] getBranches() {
            return branches;
        }

        public Object clone(){
            super.clone();
            Tree tree = new Tree();
            tree.branches = this.branches.clone(); ////!!! ВОТ КАК

            return tree;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Tree)) return false;
            Tree tree = (Tree) o;
            return Arrays.equals(getBranches(), tree.getBranches());
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(getBranches());
        }
    }
}
