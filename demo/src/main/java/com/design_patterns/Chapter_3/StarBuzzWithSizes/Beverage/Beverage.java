package com.design_patterns.Chapter_3.StarBuzzWithSizes.Beverage;

public abstract class Beverage {

    protected String description = "a beverage";
    protected double cost;
    protected SIZE size;  

    public String getDescription(){
        return description;
    }

    public double getCost(){
        return cost;
    }
    
    public SIZE getSize(){
        return size;
    }

    public enum SIZE{
        SMALL, MEDIUM, LARGE;
    }
}