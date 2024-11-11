package com.demo.lab7.designpattern.scenario1;

@Configuration
public class Configuration {
    /**
     * Se utiliza la anotación Bean para crear una clase que
     * sea inyectada en el contenedor de Spring y que utiliza el patrón
     * Singleton.
     */
    @Bean
    public GlobalConfiguration configGlobalConfiguration() {
        gc = new GlobalConfiguration();
        gc.setConfiguration1(1);
        gc.setConfiguration2(2);
        gc.setConfiguration3(3);
        gc.setConfiguration4(4);
        gc.setConfiguration5(5);
        return gc;
    }
}
