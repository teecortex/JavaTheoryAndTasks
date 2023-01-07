package com.company;

public class Main {
    public static void Love(Seasons season){
        switch (season){
            case summer:
                System.out.println("Я люблю лето");
                break;
            case fall:
                System.out.println("Я люблю осень");
                break;
            case winter:
                System.out.println("Я люблю зиму");
                break;
            case spring:
                System.out.println("Я люблю весну");
                break;

        }
    }
    public static void main(String[] args) {
        Seasons[] seasons = Seasons.values();
        for (Seasons season : seasons){
            System.out.print(season + " ");
            System.out.print(season.getTemperature() + " ");
            season.getDescription();
        }
    }
}


