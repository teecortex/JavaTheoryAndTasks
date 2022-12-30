package com.company;

public class Pear extends Fruit {
    private static final int costOfPear = 4;
    private static int numOfPears = 0;
    {
        numOfPears++;
    }
    @Override
    public int getWeight(){return this.weight;}

    public static int getCost() {return costOfPear;}

    public static int getNumOfApples() {return numOfPears;}

}
