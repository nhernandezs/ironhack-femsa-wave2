package com.demo.lab7.designpattern.scenario3;

public class WindowDisplay implements Observer {
    private final WeatherStation station;

    public WindowDisplay(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println("Actualización en Window Display: " + station.getWeatherData());
    }
}
