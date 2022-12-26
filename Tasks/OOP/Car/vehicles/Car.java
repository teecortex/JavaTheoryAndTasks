package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String model;
    private String class_of_car;
    private int weight;
    private Driver driver;
    private Engine engine;
    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }
    @Override
    public String toString(){
        System.out.println("О машине: ");
        System.out.println(this.model);
        System.out.println(this.class_of_car);
        System.out.println(this.weight);
        System.out.println("О водителе: ");
        System.out.println(this.driver.getSnp());
        System.out.println(this.driver.getExperience());
        System.out.println("О моторе: ");
        System.out.println(this.engine.getPower());
        System.out.println(this.engine.getProductivity());
        return "";
    }
    public Car(String model, String class_of_car, int weight, Driver driver, Engine engine){
        this.model = model;
        this.class_of_car = class_of_car;
        this.weight = weight;
        this.driver = new Driver(driver);
        this.engine = new Engine(engine);
    }
    public Car(){
        this.model = "";
        this.class_of_car = "";
        this.weight = 0;
        this.driver = new Driver();
        this.engine = new Engine();
    }
}
