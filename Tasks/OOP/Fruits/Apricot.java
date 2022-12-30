package com.company;

public class Apricot extends Fruit {
    private static final int costOfApricot = 9;
    private static int numOfApricots = 0;
    {
        numOfApricots++;
    }
    @Override
    public int getWeight(){return this.weight;}

    public static int getCost() {return costOfApricot;}

    public static int getNumOfApples() {return numOfApricots;}
}
