package com.company;

public enum Seasons {
    winter(-15),
    spring(8),
    summer(30){
        @Override
        public void getDescription(){
            System.out.println("Теполое время года");
        }
    },
    fall(9);
    private int temperature;
    Seasons(int temperature){
        this.temperature = temperature;
    }
    public void getDescription(){
        System.out.println("Холодное время года");
    }
    public int getTemperature(){
        return temperature;
    }
}
