package com.design_patterns.Chapter_1.Fly;

public class FlyNoFly implements FlyBehavior {
    
    @Override
    public void fly(){
        System.out.println("I can't fly!");
    }
}
