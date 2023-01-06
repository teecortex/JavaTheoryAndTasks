package com.company;

public class Drum implements Instrument{
    private int size;
    public Drum(int size){
        this.size = size;
    }
    public Drum(){
        this.size = 0;
    }

    public int getSize() {return size;}

    public void setSize(int size) {this.size = size;}
    @Override
    public void play(){System.out.println("Играет барабан " + this.size + " размера");}
}
