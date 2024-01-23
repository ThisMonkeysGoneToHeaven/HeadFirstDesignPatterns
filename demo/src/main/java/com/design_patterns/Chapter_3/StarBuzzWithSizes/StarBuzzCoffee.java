package com.design_patterns.Chapter_3.StarBuzzWithSizes;

import com.design_patterns.Chapter_3.StarBuzzWithSizes.Beverage.Beverage;
import com.design_patterns.Chapter_3.StarBuzzWithSizes.Beverage.Espresso;
import com.design_patterns.Chapter_3.StarBuzzWithSizes.Beverage.Beverage.SIZE;
import com.design_patterns.Chapter_3.StarBuzzWithSizes.Condiment.Whip;

public class StarBuzzCoffee {
    public static void main(String args[]){
        Beverage beverage = new Espresso(SIZE.LARGE);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.getCost());
    }

}
