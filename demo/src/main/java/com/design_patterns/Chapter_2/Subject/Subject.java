package com.design_patterns.Chapter_2.Subject;

import com.design_patterns.Chapter_2.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
