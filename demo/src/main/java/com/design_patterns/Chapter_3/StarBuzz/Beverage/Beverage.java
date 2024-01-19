package com.design_patterns.Chapter_3.StarBuzz.Beverage;

public abstract class Beverage {

    String description = "beverage without a name";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
