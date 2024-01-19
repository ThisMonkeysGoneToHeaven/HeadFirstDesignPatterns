package com.design_patterns.Chapter_2.WeatherStation.Subject;

import com.design_patterns.Chapter_2.WeatherStation.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
