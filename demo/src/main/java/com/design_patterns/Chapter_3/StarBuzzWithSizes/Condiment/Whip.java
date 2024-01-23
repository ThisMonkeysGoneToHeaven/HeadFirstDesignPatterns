package com.design_patterns.Chapter_3.StarBuzzWithSizes.Condiment;

import com.design_patterns.Chapter_3.StarBuzzWithSizes.Beverage.Beverage;

public class Whip extends CondimentDecorator{
    
    public Whip(Beverage beverage){
        description = beverage.getDescription() + ", Whip";
        size = beverage.getSize();
        if(size == SIZE.SMALL)
            cost = 0.10 + beverage.getCost();
        else if(size == SIZE.MEDIUM)
            cost = 0.15 + beverage.getCost();
        else
            cost = 0.20 + beverage.getCost();
    }

}
