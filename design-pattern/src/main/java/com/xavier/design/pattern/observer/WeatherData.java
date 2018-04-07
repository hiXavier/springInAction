package com.xavier.design.pattern.observer;

import java.util.Observable;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/3/7
 */
public class WeatherData extends Observable {

    public void measurmentsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMesurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurmentsChanged();
    }
    public float temperature;
    public float humidity;
    public float pressure;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
