package com.design_patterns.Practice_2;
import com.design_patterns.Practice_2.Observer.Observer;
import com.design_patterns.Practice_2.Observer.ScreenA;
import com.design_patterns.Practice_2.Subject.DataSource;

public class Simulation {
    
    public static void main(String[] args){
        
        // making new instances of subject and observers
        DataSource dataSource = new DataSource();
        Observer screenA = new ScreenA(dataSource);

        dataSource.setDataValues(10, 20);
    }
}