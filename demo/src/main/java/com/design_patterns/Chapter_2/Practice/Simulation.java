package com.design_patterns.Chapter_2.Practice;
import com.design_patterns.Chapter_2.Practice.Observer.Observer;
import com.design_patterns.Chapter_2.Practice.Observer.ScreenA;
import com.design_patterns.Chapter_2.Practice.Subject.DataSource;

public class Simulation {
    
    public static void main(String[] args){
        
        // making new instances of subject and observers
        DataSource dataSource = new DataSource();
        Observer screenA = new ScreenA(dataSource);

        dataSource.setDataValues(10, 20);
    }
}