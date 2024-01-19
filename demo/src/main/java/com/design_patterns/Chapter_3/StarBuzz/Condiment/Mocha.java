package com.design_patterns.Chapter_3.StarBuzz.Condiment;

import com.design_patterns.Chapter_3.StarBuzz.Beverage.Beverage;

public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
    
}
