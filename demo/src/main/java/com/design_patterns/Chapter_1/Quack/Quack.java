package com.design_patterns.Chapter_1.Quack;

public class Quack implements QuackBehavior{
    
    @Override
    public void quack(){
        System.out.println("Quack Quack!");
    }
}
