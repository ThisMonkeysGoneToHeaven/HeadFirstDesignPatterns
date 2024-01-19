package com.design_patterns.Chapter_2.Practice.Observer;

import javax.security.auth.Subject;

import com.design_patterns.Chapter_2.Practice.Subject.DataSource;

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
