package com.design_patterns.Chapter_1.Fly;

public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }    
}
