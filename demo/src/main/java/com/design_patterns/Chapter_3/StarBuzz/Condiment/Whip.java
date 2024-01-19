package com.design_patterns.Chapter_3.StarBuzz.Condiment;

import com.design_patterns.Chapter_3.StarBuzz.Beverage.Beverage;

public class Whip extends CondimentDecorator{
    
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }

}
