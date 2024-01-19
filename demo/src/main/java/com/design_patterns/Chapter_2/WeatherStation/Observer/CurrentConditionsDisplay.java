package com.design_patterns.Chapter_2.WeatherStation.Observer;

import com.design_patterns.Chapter_2.WeatherStation.Subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElements {

    private float temprature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temprature + " F degrees and " + humidity + "% humidity.");
    }

    @Override
    public void update(float temprature, float humidity, float pressure) {
        this.temprature = temprature;
        this.humidity = humidity;
        display();
    }
    
}
