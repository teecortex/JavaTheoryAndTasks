package com.company;

public class Guitar implements Instrument{
    private int numOfStrings;
    public Guitar(int numOfStrings){
        this.numOfStrings = numOfStrings;
    }
    public Guitar(){
        this.numOfStrings = 0;
    }
    public void setNumOfStrings(int numOfStrings){
        this.numOfStrings = numOfStrings;
    }
    public int getNumOfStrings(){
        return this.numOfStrings;
    }
    @Override
    public void play(){
        System.out.println("Играет гитара с " + this.numOfStrings + " струнами");
    }
}
