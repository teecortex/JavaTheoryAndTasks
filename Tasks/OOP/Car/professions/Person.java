package com.company.professions;

public class Person extends Driver{
    private int age;
    public Person(String snp, int experience, int age){
        super(snp, experience);
        this.age = age;
    }
    public Person(){
        super();
        this.age = 0;
    }
}
