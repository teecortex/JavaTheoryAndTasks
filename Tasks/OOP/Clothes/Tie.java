package com.company;

public class Tie extends Clothes implements ManClothes{
    @Override
    public void dressAMan(){
        System.out.println("Одели мужчину");
    }
    public Tie(Sizes size, int cost, String color){
        super(size, cost, color);
    }
    @Override
    public String toString() {
        return "Галстук: " +
                "Размер - " + sizeOfCloth + " Цена " + cost + " Цвет: " + color;
    }
}
