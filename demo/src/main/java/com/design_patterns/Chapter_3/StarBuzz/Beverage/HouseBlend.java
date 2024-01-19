package com.design_patterns.Chapter_3.StarBuzz.Beverage;

public class HouseBlend extends Beverage{
    
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost(){
        return 0.89;
    }
}
