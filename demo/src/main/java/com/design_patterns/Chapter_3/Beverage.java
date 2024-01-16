package com.design_patterns.Chapter_3;

public abstract class Beverage {

    String description = "beverage without a name";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
