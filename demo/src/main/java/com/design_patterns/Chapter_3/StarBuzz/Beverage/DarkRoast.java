package com.design_patterns.Chapter_3.StarBuzz.Beverage;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = "DarkRoast";
    }

    @Override
    public double cost(){
        return 0.99;
    }
}
