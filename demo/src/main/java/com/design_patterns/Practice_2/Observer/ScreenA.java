package com.design_patterns.Practice_2.Observer;

import javax.security.auth.Subject;

import com.design_patterns.Practice_2.Subject.DataSource;

public class ScreenA implements Observer{

    private DataSource dataSource;
    private int dataValueA;
    private int dataValueB;

    public ScreenA(DataSource dataSource){
        this.dataSource = dataSource;
        dataSource.registerObserver(this);
    }

    @Override
    public void update(int dataValueA, int dataValueB) {
        this.dataValueA = dataValueA;
        this.dataValueB = dataValueB;
        display();
    }
    
    public void display(){
        System.out.println("DataValue A: " + dataValueA + " & DataValue B: " + dataValueB);
    }
}
