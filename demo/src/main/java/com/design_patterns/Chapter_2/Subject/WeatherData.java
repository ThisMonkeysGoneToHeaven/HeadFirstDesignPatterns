package com.design_patterns.Chapter_2.Subject;

import java.util.ArrayList;

import com.design_patterns.Chapter_2.Observer.Observer;

public class WeatherData implements Subject {

    public ArrayList<Observer> observers;
    private float temprature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers)
            observer.update(temprature, humidity, pressure);
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temprature, float humidity, float pressure){
        this.temprature = temprature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }
    
    public float getTemprature(){
        return temprature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }
}
