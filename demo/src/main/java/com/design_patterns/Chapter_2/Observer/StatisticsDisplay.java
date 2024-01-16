package com.design_patterns.Chapter_2.Observer;

import com.design_patterns.Chapter_2.Subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElements {

    private float temprature;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Past week's avg temprature is " + (this.temprature - 2) + " F.");
    }

    @Override
    public void update(float temprature, float humidity, float pressure) {
        this.temprature = temprature;
        display();
    }
    
}
