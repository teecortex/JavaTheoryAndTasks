package com.company.details;

public class Engine {
    private int power;
    private int productivity;

    public void setPower(int power) {this.power = power;}

    public void setProductivity(int productivity) {this.productivity = productivity;}

    public int getPower() {return power;}

    public int getProductivity() {return productivity;}
    public Engine(int power, int productivity){
        this.power = power;
        this.productivity = productivity;
    }
    public Engine(){
        this.power = 0;
        this.productivity = 0;
    }
    public Engine(Engine engine){
        this.power = engine.getPower();
        this.productivity = engine.getProductivity();
    }
}
