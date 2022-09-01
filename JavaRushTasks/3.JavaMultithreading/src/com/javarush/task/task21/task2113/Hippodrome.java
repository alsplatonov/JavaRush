package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hippodrome {

    public static Hippodrome game;

    private List<Horse> horses = new ArrayList<>();
    
    public Hippodrome(List horses){
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }



    public void run() {

        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void move(){

        for (int i = 0; i <getHorses().size() ; i++) {
            getHorses().get(i).move();
        }
    }

    public void print(){

        for (int i = 0; i <getHorses().size() ; i++) {
            getHorses().get(i).print();
            System.out.println("");
        }

        for (int i = 0; i <10 ; i++) {
            System.out.println("");
        }
    }

    public Horse getWinner(){
        return horses.stream()
                .max(Comparator.comparingDouble(Horse::getDistance))
                .get();
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) {

        Hippodrome hippodrome = new Hippodrome(null);
        game = hippodrome;
        
        Horse horse1 = new Horse("Diego", 3,0 );
        Horse horse2 = new Horse("Arni", 3,0 );
        Horse horse3 = new Horse("Lori", 3,0 );

        ArrayList<Horse> h = new ArrayList<>();
        h.add(horse1);
        h.add(horse2);
        h.add(horse3);

       game.setHorses(h);

       game.run();
       game.printWinner();
    }
}
