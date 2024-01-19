package com.design_patterns.Chapter_2.WeatherStation;

import com.design_patterns.Chapter_2.WeatherStation.Observer.CurrentConditionsDisplay;
import com.design_patterns.Chapter_2.WeatherStation.Observer.StatisticsDisplay;
import com.design_patterns.Chapter_2.WeatherStation.Subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args){
        
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);        
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        
        // ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 35.4f);
        weatherData.setMeasurements(82, 70, 29.4f);
        weatherData.setMeasurements(64, 45, 43.4f);
    }
}
