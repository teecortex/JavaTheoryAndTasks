package com.company;

public class Skirt extends Clothes implements WomanClothes{
    @Override
    public void dressAWoman(){
        System.out.println("Одели женщину");
    }
    public Skirt(Sizes size, int cost, String color){
        super(size, cost, color);
    }
    @Override
    public String toString() {
        return "Юбка: " +
                "Размер - " + sizeOfCloth + " Цена " + cost + " Цвет: " + color;
    }
}
