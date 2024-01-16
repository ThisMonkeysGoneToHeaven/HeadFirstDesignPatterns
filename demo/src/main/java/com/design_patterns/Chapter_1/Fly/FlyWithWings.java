package com.design_patterns.Chapter_1.Fly;

public class FlyWithWings implements FlyBehavior {
    
    @Override
    public void fly() {
        System.out.println("I'm Flying!");
    }    
}
