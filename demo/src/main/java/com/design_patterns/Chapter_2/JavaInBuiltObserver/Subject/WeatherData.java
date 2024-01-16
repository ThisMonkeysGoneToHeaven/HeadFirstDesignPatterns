package com.design_patterns.Chapter_2.JavaInBuiltObserver.Subject;

import java.util.Observable;;

public class WeatherData extends Observable{
    private float temprature;
    private float pressure;
    private float humidity;

    public WeatherData(){

    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temprature, float pressure, float humidity){
        this.temprature = temprature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }

    public float getTemprature(){
        return this.temprature;
    }

    public float getPressure(){
        return this.pressure;
    }

    public float getHumidity(){
        return this.humidity;
    }
}
