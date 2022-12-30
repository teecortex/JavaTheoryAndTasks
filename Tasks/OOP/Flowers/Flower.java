package com.company;

public class Flower {
    private static int numOfFlowers = 0;
    {
        numOfFlowers++;
    }
    private String counrty;
    private int shelfLife;
    private int cost;
    public Flower(String counrty, int shelfLife, int cost){
        this.counrty = counrty;
        this.shelfLife = shelfLife;
        this.cost = cost;
    }
    public Flower(){
        this.counrty = "";
        this.shelfLife = 0;
        this.cost = 0;
    }

    public String getCounrty() {return counrty;}

    public int getShelfLife() {return shelfLife;}

    public int getCost() {return cost;}

    public static int getNumOfFlowers() {return numOfFlowers;}

    public void setCounrty(String counrty) {this.counrty = counrty;}

    public void setShelfLife(int shelfLife) {this.shelfLife = shelfLife;}

    public void setCost(int cost) {this.cost = cost;}
}
