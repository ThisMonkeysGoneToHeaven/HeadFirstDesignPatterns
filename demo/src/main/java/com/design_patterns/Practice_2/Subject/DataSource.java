package com.design_patterns.Practice_2.Subject;

import java.util.ArrayList;
import java.util.List;

import com.design_patterns.Practice_2.Observer.Observer;

public class DataSource implements Subject {

    private List<Observer> myObservers;
    private int dataValueA;
    private int dataValueB;

    public DataSource(){
        myObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer obs) {
        if(!myObservers.contains(obs))
            myObservers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        if(myObservers.contains(obs))
            myObservers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs: myObservers)
            obs.update(dataValueA, dataValueB);
    }

    public void setDataValues(int dataValueA, int dataValueB){
        this.dataValueA = dataValueA;
        this.dataValueB = dataValueB;
        notifyObservers();
    }

    public int getDataValueA(){
        return this.dataValueA;
    }

    public int getDataValueB(){
        return this.dataValueB;
    }
    
}
