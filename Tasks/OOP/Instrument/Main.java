package com.company;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[5];
        instruments[0] = new Guitar(5);
        instruments[1] = new Guitar(7);
        instruments[2] = new Drum(8);
        instruments[3] = new Guitar(15);
        instruments[4] = new Pipe(4);
        for (Instrument eachElement : instruments){
            eachElement.play();
        }
    }
}


