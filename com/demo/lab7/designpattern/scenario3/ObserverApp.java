package com.demo.lab7.designpattern.scenario3;

public class ObserverApp {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay(station);
        WindowDisplay windowDisplay = new WindowDisplay(station);

        station.addObserver(phoneDisplay);
        station.addObserver(windowDisplay);

        station.setWeatherData("Soleado");
        station.setWeatherData("Lluvioso");
    }
}
