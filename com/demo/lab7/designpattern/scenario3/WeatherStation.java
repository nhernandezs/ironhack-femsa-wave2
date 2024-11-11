package com.demo.lab7.designpattern.scenario3;

public class WeatherStation extends Subject {
    private String weatherData;

    public String getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(String weatherData) {
        this.weatherData = weatherData;
        notifyObservers(); // Notifica a todos los observadores sobre el cambio
    }
}
