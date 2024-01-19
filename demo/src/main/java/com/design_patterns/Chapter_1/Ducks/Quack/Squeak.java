package com.design_patterns.Chapter_1.Ducks.Quack;

public class Squeak implements QuackBehavior{
    
    @Override
    public void quack(){
        System.out.println("Squeaky Squeak!");
    }
}
