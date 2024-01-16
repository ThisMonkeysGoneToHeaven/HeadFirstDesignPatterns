package com.design_patterns.Chapter_1.Duck;

import com.design_patterns.Chapter_1.Fly.FlyWithWings;
import com.design_patterns.Chapter_1.Quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a sexy Mallard duck!");
    }
}
