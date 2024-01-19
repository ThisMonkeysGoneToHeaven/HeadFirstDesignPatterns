package com.design_patterns.Chapter_2.Practice.Subject;

import com.design_patterns.Chapter_2.Practice.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer obs);
    public void removeObserver(Observer obs);
    public void notifyObservers();
    public void setDataValues(int dataValueA, int dataValueB);
}
