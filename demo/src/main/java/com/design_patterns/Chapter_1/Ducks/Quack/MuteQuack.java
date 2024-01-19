package com.design_patterns.Chapter_1.Ducks.Quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I can't Quack Quack!");
    }
    
}
