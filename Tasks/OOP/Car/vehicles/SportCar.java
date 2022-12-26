package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private int maximum_speed;
    public SportCar(String model, String class_of_car, int weight, Driver driver, Engine engine, int maximum_speed){
        super(model, class_of_car, weight, driver, engine);
        this.maximum_speed = maximum_speed;
    }
    public SportCar(){
        super();
        this.maximum_speed = 0;
    }
}
