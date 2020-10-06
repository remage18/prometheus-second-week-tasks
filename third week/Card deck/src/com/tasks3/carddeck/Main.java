package com.tasks3.carddeck;

public class Main {

    public static void main(String[] args) {
        Deck test = new Deck();
        test.shuffle();
        test.drawOne();
        Card smp = test.drawOne();
        System.out.println(smp.getSuit().getName() + " " + smp.getRank().getName());
    }
}
