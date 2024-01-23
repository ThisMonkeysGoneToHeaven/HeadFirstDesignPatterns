package com.design_patterns.Chapter_3.StarBuzzWithSizes.Beverage;

public class Espresso extends Beverage {
    
    public Espresso(SIZE size){
        description = "Espresso";
        this.size = size;
        if(size == SIZE.SMALL)
            cost = 0.99;
        else if(size == SIZE.MEDIUM)
            cost = 1.39;
        else
            cost = 1.75;
    }
    
}
