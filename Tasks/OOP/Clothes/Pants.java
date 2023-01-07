package com.company;

public class Pants extends Clothes implements ManClothes, WomanClothes{
    @Override
    public void dressAMan(){
        System.out.println("Одели мужчину");
    }
    @Override
    public void dressAWoman(){
        System.out.println("Одели женщину");
    }
    public Pants(Sizes size, int cost, String color){
        super(size, cost, color);
    }
    @Override
    public String toString() {
        return "Штаны: " +
                "Размер - " + sizeOfCloth + " Цена " + cost + " Цвет: " + color;
    }
}
