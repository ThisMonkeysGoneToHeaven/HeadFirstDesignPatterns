package com.design_patterns.Chapter_1.Ducks;

import com.design_patterns.Chapter_1.Ducks.Duck.Duck;
import com.design_patterns.Chapter_1.Ducks.Duck.ModelDuck;
import com.design_patterns.Chapter_1.Ducks.Fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args){

        Duck model = new ModelDuck();
        model.performFly();        
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
