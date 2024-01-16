package com.design_patterns.Chapter_2.JavaInBuiltObserver.Observer;

import java.util.Observable;
import java.util.Observer;

import com.design_patterns.Chapter_2.JavaInBuiltObserver.Subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElements {
    
    Observable observable;
    private float temprature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temprature = weatherData.getTemprature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("temp : " + this.temprature + " and humidity is " + this.humidity + " %");
    }
    
}
