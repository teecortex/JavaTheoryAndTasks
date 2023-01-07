package com.company;

public abstract class Clothes {
    protected Sizes sizeOfCloth;
    protected int cost;
    protected String color;

    public Clothes(Sizes sizeOfCloth, int cost, String color) {
        this.sizeOfCloth = sizeOfCloth;
        this.cost = cost;
        this.color = color;
    }
    public Clothes(){
        this.sizeOfCloth = null;
        this.cost = 0;
        this.color = "";
    }

    protected int getCost() {
        return cost;
    }

    protected Sizes getSizeOfCloth() {
        return sizeOfCloth;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected void setSizeOfCloth(Sizes sizeOfCloth) {
        this.sizeOfCloth = sizeOfCloth;
    }

    protected void setCost(int cost) {
        this.cost = cost;
    }
}
