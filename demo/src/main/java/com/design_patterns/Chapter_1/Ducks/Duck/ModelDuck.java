package com.design_patterns.Chapter_1.Ducks.Duck;

import com.design_patterns.Chapter_1.Ducks.Fly.FlyNoFly;
import com.design_patterns.Chapter_1.Ducks.Quack.Quack;

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