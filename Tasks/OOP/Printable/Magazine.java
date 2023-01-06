package com.company;

public class Magazine implements Printable{
    private String name;
    public Magazine(String name){
        this.name = name;
    }
    @Override
    public void print(){
        System.out.println(this.name);
    }
    public static void printMagazines(Printable[] printables){
        for (Printable eachElement : printables){
            if (eachElement instanceof Magazine){
                eachElement.print();
            }
        }
    }
}
