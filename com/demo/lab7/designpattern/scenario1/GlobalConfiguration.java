package com.demo.lab7.designpattern.scenario1;

public class GlobalConfiguration {
    private String configuracion1;
    private final Object lock = new Object();

    public void setAttribute(String value) {
        /**
         * Se agrega synchronized para evitar problemas de concurrencia.
         */
        synchronized (lock) {
            configuracion1 = value;
        }
    }

    public String getAttribute() {
        synchronized (lock) {
            return configuracion1;
        }
    }
}
