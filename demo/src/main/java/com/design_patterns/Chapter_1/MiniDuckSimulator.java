package com.design_patterns.Chapter_1;

import com.design_patterns.Chapter_1.Duck.Duck;
import com.design_patterns.Chapter_1.Duck.ModelDuck;
import com.design_patterns.Chapter_1.Fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args){

        Duck model = new ModelDuck();
        model.performFly();        
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
