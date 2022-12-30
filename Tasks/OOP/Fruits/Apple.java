package com.company;

public class Apple extends Fruit {
    private static final int costOfApple = 5;
    private static int numOfApples = 0;
    {
        numOfApples++;
    }
    @Override
    public int getWeight(){return this.weight;}

    public static int getCost() {return costOfApple;}

    public static int getNumOfApples() {return numOfApples;}

}
