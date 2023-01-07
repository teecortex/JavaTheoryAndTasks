package com.company;

public class Atelier{
    public static void dressAMan(Clothes[] clothes){
        for (Clothes cloth : clothes){
            if (cloth instanceof ManClothes){
                System.out.println(cloth.toString());
            }
        }
    }
    public static void dressAWoman(Clothes[] clothes){
        for (Clothes cloth : clothes){
            if (cloth instanceof WomanClothes){
                System.out.println(cloth.toString());
            }
        }
    }
}
