package com.demo.lab7.designpattern.scenario1;

public class SingletonApp {
    @Autowired
    GlobalConfiguration configuration;

    public void configure() {
        //Uso de la clase única que contiene la configuración.
        System.out.println(configuration.getConfiguration1());
    }
}
