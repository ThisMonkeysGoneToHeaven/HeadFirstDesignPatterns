package com.design_patterns.Chapter_3.StarBuzz.Condiment;

import com.design_patterns.Chapter_3.StarBuzz.Beverage.Beverage;

public class SteamedMilk extends CondimentDecorator {

    Beverage beverage;

    public SteamedMilk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }
    
}
