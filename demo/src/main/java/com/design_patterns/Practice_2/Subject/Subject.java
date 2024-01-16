package com.design_patterns.Practice_2.Subject;

import com.design_patterns.Practice_2.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer obs);
    public void removeObserver(Observer obs);
    public void notifyObservers();
    public void setDataValues(int dataValueA, int dataValueB);
}
