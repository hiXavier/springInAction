package com.xavier.design.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/3/7
 */
public class CurrentConditionDisplay implements Displayment,Observer {
    Observable observable;
    private Float temperature;
    private Float humidity;

    @Override
    public void display() {
        System.out.println("Current conditions: temperature " + temperature + ",humidity " + humidity );
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.temperature;
            this.humidity = weatherData.humidity;
            display();
        }
    }

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
}
