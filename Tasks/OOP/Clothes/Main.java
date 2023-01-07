package com.company;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new TShirt(Sizes.M, 90, "red");
        clothes[1] = new Skirt(Sizes.S, 80, "yellow");
        clothes[2] = new Pants(Sizes.L, 200, "black");
        clothes[3] = new Tie(Sizes.XS, 300, "green");
        Atelier.dressAMan(clothes);
        Atelier.dressAWoman(clothes);
    }
}


