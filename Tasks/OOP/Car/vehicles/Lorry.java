package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private int load_capacity;
    public Lorry(String model, String class_of_car, int weight, Driver driver, Engine engine, int load_capacity){
        super(model, class_of_car, weight, driver, engine);
        this.load_capacity = load_capacity;
    }
    public Lorry(){
        super();
        this.load_capacity = 0;
    }
}
