package com.design_patterns.Chapter_3.StarBuzz.Condiment;

import com.design_patterns.Chapter_3.StarBuzz.Beverage.Beverage;

public class Soy extends CondimentDecorator{
    
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
