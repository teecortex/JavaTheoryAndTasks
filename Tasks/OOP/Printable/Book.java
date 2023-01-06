package com.company;

public class Book implements Printable{
    private String name;
    public Book(String name){
        this.name = name;
    }
    @Override
    public void print(){
        System.out.println(this.name);
    }
    public static void printBooks(Printable[] printables){
        for (Printable eachElement : printables){
            if (eachElement instanceof Book){
                eachElement.print();
            }
        }
    }

}
