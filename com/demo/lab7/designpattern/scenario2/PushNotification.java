package com.demo.lab7.designpattern.scenario2;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Enviando notificación Push");
    }
}
