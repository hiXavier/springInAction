package com.xavier.design.pattern.observer;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/3/7
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMesurements(80,65,30);
    }
}
