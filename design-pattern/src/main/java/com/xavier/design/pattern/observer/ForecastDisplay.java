package com.xavier.design.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/3/7
 */
public class ForecastDisplay implements Observer,Displayment {

    private float currentPressure = 29.93f;
    private float lastPressure;
    Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast conditions: temperature " + currentPressure );
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }
}
