package com.company;

public class Pipe implements Instrument{
    private int diameter;

    public Pipe(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    @Override
    public void play(){
        System.out.println("Труба играет с диаметром: " + this.diameter);
    }
}
