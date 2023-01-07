package com.company;

public class TShirt extends Clothes implements ManClothes, WomanClothes{
    @Override
    public void dressAMan(){
        System.out.println("Одели мужчину");
    }
    @Override
    public void dressAWoman(){
        System.out.println("Одели женщину");
    }
    public TShirt(Sizes size, int cost, String color){
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Футболка: " +
                "Размер - " + sizeOfCloth + " Цена " + cost + " Цвет: " + color;
    }
}
