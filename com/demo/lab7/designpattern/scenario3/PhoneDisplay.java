package com.demo.lab7.designpattern.scenario3;

public class PhoneDisplay implements Observer {
    private final WeatherStation station;

    public PhoneDisplay(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println("Actualización en Phone Display: " + station.getWeatherData());
    }
}
