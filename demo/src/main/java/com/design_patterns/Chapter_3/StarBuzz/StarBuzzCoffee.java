package com.design_patterns.Chapter_3.StarBuzz;

import com.design_patterns.Chapter_3.StarBuzz.Beverage.Beverage;
import com.design_patterns.Chapter_3.StarBuzz.Beverage.DarkRoast;
import com.design_patterns.Chapter_3.StarBuzz.Beverage.Espresso;
import com.design_patterns.Chapter_3.StarBuzz.Beverage.HouseBlend;
import com.design_patterns.Chapter_3.StarBuzz.Condiment.Mocha;
import com.design_patterns.Chapter_3.StarBuzz.Condiment.Soy;
import com.design_patterns.Chapter_3.StarBuzz.Condiment.Whip;

public class StarBuzzCoffee {
    
    public static void main(String args[]){
        
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
