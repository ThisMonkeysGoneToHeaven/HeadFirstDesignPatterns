package com.design_patterns.Chapter_2.JavaInBuiltObserver;

import com.design_patterns.Chapter_2.JavaInBuiltObserver.Observer.CurrentConditionsDisplay;
import com.design_patterns.Chapter_2.JavaInBuiltObserver.Subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 35.4f);
    }
}
