package com.company;

public abstract class Fruit {
    protected int weight;
    public final void printManufacturerInfo(){
        System.out.printf("Made in Russia");
    }
    public abstract int getWeight();
}
