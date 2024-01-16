package com.design_patterns.Chapter_1.Duck;

import com.design_patterns.Chapter_1.Fly.FlyNoFly;
import com.design_patterns.Chapter_1.Quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoFly();
        quackBehavior = new Quack();
    }

    @Override
    public void display(){
        System.out.println("I'm a model duck!");
    }   
}